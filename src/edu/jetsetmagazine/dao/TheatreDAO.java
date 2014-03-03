/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Theatre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Talel
 */
public class TheatreDAO {
    
    public void inserttheatre(Theatre t)
         {

            String requete = "insert into theatre (nom_theatre,description_theatre,date_theatre,adresse_theatre) values (?,?,?,?)";
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, t.getNom_theatre());
                ps.setString(2, t.getDescription_theatre());
                ps.setDate(3, t.getDate_theatre());
                ps.setString(4, t.getAdresse_théatre());

                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès");
            } catch (SQLException ex) {
               //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
            }
        }
    //public void updatePrestataire(Prestataire p){
//        String requete = "update prestataire set password_prestataire = ?,Mail_prestataire = ?,Nom_prestataire = ?,adresse_prestataire = ?,Tel_prestataire = ?,Nom_service = ?,logo = ?,description = ? where id_prestataire = ?";
//                        
//        try {
//            System.out.println(p);
//            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
//            ps.setString(1, p.getMotDePasse());
//            ps.setString(2, p.getAdresse_mail());
//             ps.setString(3, p.getPseudo());
//              ps.setString(4, p.getAdresse());
//              ps.setString(5, p.getTel());
//             ps.setString(6, p.getService());
//              ps.setString(7, p.getLogo());
//              ps.setString(8,p.getDescription());
//              
//              ps.setInt(9,p.getId());
//              
//            ps.executeUpdate();
//            System.out.println("Mise à jour effectuée avec succès");
//        } catch (SQLException ex) {
//           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
//        }
//}
    public void updateSoiree(Theatre t)
             {
                String requete = "update theatre set nom_theatre = ?,description_theatre = ?,date_theatre = ?,adresse_theatre = ? where code_theatre = ?";
                try {
                    System.out.println(t.toString());
                    PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                    ps.setString(1, t.getNom_theatre());
                    ps.setString(2, t.getDescription_theatre());
                    ps.setDate(3, t.getDate_theatre());
                    ps.setString(4, t.getAdresse_théatre());
                    ps.setInt(5, t.getCode_theatre());
                    ps.executeUpdate();
                    System.out.println("Mise à jour effectuée avec succès");
                } catch (SQLException ex) {
                   //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("erreur lors de la mise à jour "+ex.getMessage());
                }
             }
             
    public void deleteTheatre(int num){

          String requete = "delete from theatre where code_theatre=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
                         
                         
                         
    public List<Theatre> DisplayAllTheatre (){


        List<Theatre> listetheatre = new ArrayList<>();

        String requete = "select * from theatre";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            SoireeDAO soireeDAO = new SoireeDAO();
            while(resultat.next()){
                Theatre theatre =new Theatre();
                theatre.setCode_theatre(resultat.getInt(1));
                theatre.setNom_theatre(resultat.getString(2));
                theatre.setDescription_theatre(resultat.getString(3));
                theatre.setDate_theatre(resultat.getDate(4));
                theatre.setAdresse_théatre(resultat.getString(5));
                listetheatre.add(theatre);
            }
            return listetheatre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des theatre "+ex.getMessage());
            return null;
        }
    }
    
    
        public Theatre findtheatreByID(int num){

        String requete = "select * from theatre where code_theatre = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, num);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Theatre theatre = new Theatre();
        while (resultat.next()){

           theatre.setCode_theatre(resultat.getInt(1));
           theatre.setNom_theatre(resultat.getString(2));
           theatre.setDescription_theatre(resultat.getString(3));       
           theatre.setDate_theatre(resultat.getDate(4));
           theatre.setAdresse_théatre(resultat.getString(5));                 
        }
        
        return theatre;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    
        public Theatre findtheatreBynom(String nom){

        String requete = "select * from theatre where nom_theatre = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, nom);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Theatre theatre = new Theatre();
        while (resultat.next()){

           theatre.setCode_theatre(resultat.getInt(1));
           theatre.setNom_theatre(resultat.getString(2));
           theatre.setDescription_theatre(resultat.getString(3));       
           theatre.setDate_theatre(resultat.getDate(4));
           theatre.setAdresse_théatre(resultat.getString(5));                 
        }
        
        return theatre;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
        
    
    
}
