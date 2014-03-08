/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Img;
import edu.jetsetmagazine.entities.Soiree;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Talel
 */
public class ImageDAO {

    public ImageDAO() {
    }
    
//    public void sauveIMG(String location, String name) throws Exception 
//{
//  File monImage = new File(location);
//  FileInputStream istreamImage = new FileInputStream(monImage);
//  try 
//  {
//    PreparedStatement ps = MyConnection.getInstance().prepareStatement("insert into image (name, img) values (?,?)");
//    try 
//    {
//        ps.setString(1, name);
//        ps.setBinaryStream(2, istreamImage, (int) monImage.length());
//        ps.executeUpdate();
//    }
//    finally 
//    {
//      ps.close();
//    }
//  } 
//  finally 
//  {
//    istreamImage.close();
//  }
//}
    public void insererimage(Img i) throws Exception 
{
  File monImage = new File(i.getLocation());
  try 
  (     FileInputStream istreamImage = new FileInputStream(monImage)) {
    PreparedStatement ps = MyConnection.getInstance().prepareStatement("insert into img (name, image, date_evenement, description) values (?,?,?,?)");
    try 
    {
        ps.setString(1, i.getName());
        ps.setBinaryStream(2, istreamImage, (int) monImage.length());
        ps.setDate(3, i.getDate_evenement());
        ps.setString(4, i.getDescription());
        ps.executeUpdate();
    }
    finally 
    {
      ps.close();
    }
  }
}
    
    public Image DisplayImage(String name)
              
      { Image image = null;    
      String requete="select image from img where name='"+name+"'";      
          try {
           Statement ps;
          ps = MyConnection.getInstance().createStatement();
          ResultSet resultat = ps.executeQuery(requete);
              //System.out.println("1111");
           //ps.setString(1, name);
            
          // ResultSet resultat = ps.executeQuery(requete);
              //System.out.println("222222");
            if (resultat.next())
            {
                //System.out.println("333333");
                Blob test=resultat.getBlob(1); 
                InputStream in = test.getBinaryStream();
                image = ImageIO.read(in);                    
                         
            }
            
          } catch (IOException ex) {
            //Logger.getLogger(Salledao.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("erreur ssssss"+ex.getMessage());
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur dddddddddddddddd"+ex.getMessage());
            
          }
      return image;   
    }
    public List<Img> DisplayAllimage (){


        List<Img> listeig = new ArrayList<>();

        String requete = "select * from img";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ImageDAO imgDAO = new ImageDAO();
            while(resultat.next()){
                Img i =new Img();
                i.setId(resultat.getInt(1));
                i.setName(resultat.getString(2));
                //soiree.setDescription_soiree(resultat.getString(3));
                i.setDate_evenement(resultat.getDate(4));
                i.setDescription(resultat.getString(5));
                listeig.add(i);
            }
            return listeig;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
    
}
