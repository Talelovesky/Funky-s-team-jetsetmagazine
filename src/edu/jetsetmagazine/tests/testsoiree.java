/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.SoireeDAO;
import edu.jetsetmagazine.entities.Soiree;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Talel
 */
public class testsoiree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Date d=new Date(2014-1900, 12, 31);
       Soiree s=new Soiree(" Dash berlin party", "c'est la soiree du DJ international dash berlin .............", d,"Bora Bora Sousse ");
       SoireeDAO soireedao= new SoireeDAO();
       //soireedao.insertSoiree(s);
        
        
        
//        soireedao.deleteadministrateur(6);
        //String datesoiree="2014/10/25";
//        
//        List<Soiree> list;
//        list = new ArrayList<>();
//        list=soireedao.DisplayAllSoiree();
//        System.out.println(""+list.size());
//        for(Soiree soi:list)
//        {
//            System.out.println(soi.toString());
//            System.out.println("------------------------------------------------------------");
//        }
        
//        Soiree s2=new Soiree();
//        s2=soireedao.findAdminByID(7);
//        System.out.println(s2.toString());
        
        //soireedao.deleteSoiree(7);
//        System.out.println(""+s.toString());
//        System.out.println("///////////////////////////////////////////");
//        
//        s.setAdresse_soiree("malla blassa ");
//        s.setNom_soiree("sahreya te3baa !!!");
//        soireedao.updateSoiree(s);
//        System.out.println("**************************************************************");
//        System.out.println(""+s.toString());
//        System.out.println("//////////////////////////////////////////////");
//         List<Soiree> list1;
//        list1 = new ArrayList<>();
//        list1=soireedao.DisplayAllSoiree();
//        System.out.println(""+list.size());
//        for(Soiree soi:list1)
//        {
//            System.out.println(soi.toString());
//            System.out.println("------------------------------------------------------------");
//        }
//        
//        
       
       Soiree s3=new Soiree("est", "taraji ya dawla", d, "vive l'esperance");
       soireedao.insertSoiree(s3);
       
       s3.setNom_soiree("mkach5aaa");
       s3.setDate_soiree(d);
       s3.setDescription_soiree("taraji ya dawla");
       s3.setAdresse_soiree("vive l'esperance");
       s3.setCode_soiree(s3.getCode_soiree());
       
       soireedao.updateSoiree(s3);
       
       
       
        
        
        
    }
}
