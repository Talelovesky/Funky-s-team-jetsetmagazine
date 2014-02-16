/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.entities;

/**
 *
 * @author Talel
 */
public class Administrateur {
    private int id_admin;
    private String nom_admin ;
    private String prenom_admin ;
    private String mail_admin;
    private String telephone_admin;
    private String login_admin;
    private String passwd_admin;

    public Administrateur(String nom_admin, String prenom_admin, String mail_admin, String telephone_admin, String login_admin, String passwd_admin) {
        this.nom_admin = nom_admin;
        this.prenom_admin = prenom_admin;
        this.mail_admin = mail_admin;
        this.telephone_admin = telephone_admin;
        this.login_admin = login_admin;
        this.passwd_admin = passwd_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public String getPrenom_admin() {
        return prenom_admin;
    }

    public String getMail_admin() {
        return mail_admin;
    }

    public String getTelephone_admin() {
        return telephone_admin;
    }

    public String getLogin_admin() {
        return login_admin;
    }

    public String getPasswd_admin() {
        return passwd_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public void setPrenom_admin(String prenom_admin) {
        this.prenom_admin = prenom_admin;
    }

    public void setMail_admin(String mail_admin) {
        this.mail_admin = mail_admin;
    }

    public void setTelephone_admin(String telephone_admin) {
        this.telephone_admin = telephone_admin;
    }

    public void setLogin_admin(String login_admin) {
        this.login_admin = login_admin;
    }

    public void setPasswd_admin(String passwd_admin) {
        this.passwd_admin = passwd_admin;
    }
    
    
    
    
    
}
