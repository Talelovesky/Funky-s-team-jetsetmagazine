/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Administrateur;
import edu.jetsetmagazine.entities.Soiree;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
             
                         public void deleteadministrateur(int num){

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
}
