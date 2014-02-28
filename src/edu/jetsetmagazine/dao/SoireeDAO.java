/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Administrateur;
import edu.jetsetmagazine.entities.Soiree;
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
public class SoireeDAO {
    
    public void insertSoiree(Soiree s)
         {

            String requete = "insert into soiree (nom_soiree,description_soiree,date_soiree,adresse_soiree) values (?,?,?,?)";
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, s.getNom_soiree());
                ps.setString(2, s.getDescription_soiree());
                ps.setDate(3, s.getDate_soiree());
                ps.setString(4, s.getAdresse_soiree());

                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès");
            } catch (SQLException ex) {
               //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
            }
        }
    public void updateSoiree(Soiree s)
             {
                String requete = "update soiree set nom_soiree=?, description_soiree=?, date_soiree=?, adresse_soiree=? where code_soiree=?";
                try {
                    PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                    ps.setString(1, s.getNom_soiree());
                    ps.setString(2, s.getDescription_soiree());
                    ps.setDate(3, s.getDate_soiree());
                    ps.setString(4, s.getAdresse_soiree());
                    ps.setInt(5, s.getCode_soiree());
                    ps.executeUpdate();
                    System.out.println("Mise à jour effectuée avec succès");
                } catch (SQLException ex) {
                   //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("erreur lors de la mise à jour "+ex.getMessage());
                }
             }
             
    public void deleteSoiree(int num){

          String requete = "delete from soiree where code_soiree=?";
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
                         
                         
                         
    public List<Soiree> DisplayAllSoiree (){


        List<Soiree> listesoiree = new ArrayList<>();

        String requete = "select * from soiree";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            SoireeDAO soireeDAO = new SoireeDAO();
            while(resultat.next()){
                Soiree soiree =new Soiree();
                soiree.setCode_soiree(resultat.getInt(1));
                soiree.setNom_soiree(resultat.getString(2));
                soiree.setDescription_soiree(resultat.getString(3));
                soiree.setDate_soiree(resultat.getDate(4));
                soiree.setAdresse_soiree(resultat.getString(5));
                listesoiree.add(soiree);
            }
            return listesoiree;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
    
        public Soiree findAdminByID(int num){

        String requete = "select * from soiree where code_soiree = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, num);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Soiree soiree = new Soiree();
        while (resultat.next()){

           soiree.setCode_soiree(resultat.getInt(1));
           soiree.setNom_soiree(resultat.getString(2));
           soiree.setDescription_soiree(resultat.getString(3));       
           soiree.setDate_soiree(resultat.getDate(4));
           soiree.setAdresse_soiree(resultat.getString(5));                 
        }
        
        return soiree;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    
        public Soiree findAdminBynom(String nom){

        String requete = "select * from soiree where nom_soiree = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, nom);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Soiree soiree = new Soiree();
        while (resultat.next()){

           soiree.setCode_soiree(resultat.getInt(1));
           soiree.setNom_soiree(resultat.getString(2));
           soiree.setDescription_soiree(resultat.getString(3));       
           soiree.setDate_soiree(resultat.getDate(4));
           soiree.setAdresse_soiree(resultat.getString(5));                 
        }
        
        return soiree;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
        
}
