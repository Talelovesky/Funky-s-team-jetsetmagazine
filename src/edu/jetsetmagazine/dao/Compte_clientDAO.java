/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Compte_client;
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
public class Compte_clientDAO {
    public void inserercompteclient(Compte_client cc) 
         {

            String requete = "insert into compteclient (login,passwd,nom_client,prenom_client,adresse_client,numero_telephone_client,email_client) values (?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, cc.getLogin());
                ps.setString(2, cc.getPasswd());
                ps.setString(3, cc.getNom_client());
                ps.setString(4, cc.getPrenom_client());
                ps.setString(5, cc.getAdresse_client());
                ps.setString(6, cc.getNum_telephone_client());
                ps.setString(7, cc.getEmail());
                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès");
            } catch (SQLException ex) {
               //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
            }
        }
         
//             public void updateAdmin(Administrateur a)
//             {
//                String requete = "update administrateur set nom_admin=?, prenom_admin=?, mail_admin=?, telephone_admin=?, login_admin=?, passwd_admin=? where id_admin=?";
//                try {
//                    PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
//                    ps.setString(1, a.getNom_admin());
//                    ps.setString(2, a.getPrenom_admin());
//                    ps.setString(3, a.getMail_admin());
//                    ps.setString(4, a.getTelephone_admin());
//                    ps.setString(5, a.getLogin_admin());
//                    ps.setString(6, a.getPasswd_admin());
//                    ps.setInt(7, a.getId_admin());
//                    ps.executeUpdate();
//                    System.out.println("Mise à jour effectuée avec succès");
//                } catch (SQLException ex) {
//                   //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("erreur lors de la mise à jour "+ex.getMessage());
//                }
//             }

            public void deleteCompte_client(int num){

          String requete = "delete from compteclient where id_compte_client=?";
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
            
            
        public Compte_client findcompteclientByLogin(String login){

        String requete = "select * from compteclient where login = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, login);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Compte_client cc=new Compte_client();
        while (resultat.next()){

           cc.setId_client(resultat.getInt(1));
           cc.setLogin(resultat.getString(2));
           cc.setPasswd(resultat.getString(3));       
           cc.setNom_client(resultat.getString(4));
           cc.setPrenom_client(resultat.getString(5));
           cc.setAdresse_client(resultat.getString(6));
           cc.setNum_telephone_client(resultat.getString(7));
           cc.setDate_adhesion(resultat.getDate(8));
           cc.setEmail(resultat.getString(9));
          
        }
        
        return cc;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
        
         public Compte_client findcompteclientByID(int id){

        String requete = "select * from compteclient where id_compte_client = ?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, id);
        ResultSet resultat = ps.executeQuery();
        //AdministrateurDAO admindao = new AdministrateurDAO();
        Compte_client cc=new Compte_client();
        while (resultat.next()){

           cc.setId_client(resultat.getInt(1));
           cc.setLogin(resultat.getString(2));
           cc.setPasswd(resultat.getString(3));       
           cc.setNom_client(resultat.getString(4));
           cc.setPrenom_client(resultat.getString(5));
           cc.setAdresse_client(resultat.getString(6));
           cc.setNum_telephone_client(resultat.getString(7));
           cc.setDate_adhesion(resultat.getDate(8));
           cc.setEmail(resultat.getString(9));
          
        }
        
        return cc;
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
        
        
        
        public List<Compte_client> DisplayAllCompteclient (){


        List<Compte_client> listecompteclient = new ArrayList<>();

        String requete = "select * from compteclient";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Compte_clientDAO compteclientDAO = new Compte_clientDAO();
            while(resultat.next()){
                Compte_client cc =new Compte_client();
                cc.setId_client(resultat.getInt(1));
                cc.setLogin(resultat.getString(2));
                cc.setPasswd(resultat.getString(3));       
                cc.setNom_client(resultat.getString(4));
                cc.setPrenom_client(resultat.getString(5));
                cc.setAdresse_client(resultat.getString(6));
                cc.setNum_telephone_client(resultat.getString(7));
                cc.setDate_adhesion(resultat.getDate(8));
                cc.setEmail(resultat.getString(9));
          
                listecompteclient.add(cc);
            }
            return listecompteclient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
     
    
}
