/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.entities;

import java.sql.Date;

/**
 *
 * @author Talel
 */
public class Compte_client {
    private int id_client;
    private String login;
    private String passwd;
    private String email;
    private String nom_client;
    private String prenom_client;
    private String adresse_client;
    private String num_telephone_client;
    private Date  date_adhesion;
    private int confirmation;

    public int getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(int confirmation) {
        this.confirmation = confirmation;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getId_client() {
        return id_client;
    }

    public String getLogin() {
        return login;
    }

    public String getNom_client() {
        return nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    public String getNum_telephone_client() {
        return num_telephone_client;
    }

    public Date getDate_adhesion() {
        return date_adhesion;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }

    public void setNum_telephone_client(String num_telephone_client) {
        this.num_telephone_client = num_telephone_client;
    }

    public void setDate_adhesion(Date date_adhesion) {
        this.date_adhesion = date_adhesion;
    }

    public Compte_client(String login, String passwd,String email, String nom_client, String prenom_client, String adresse_client, String num_telephone_client) {
        this.login = login;
        this.passwd=passwd;
        this.email=email;
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.adresse_client = adresse_client;
        this.num_telephone_client = num_telephone_client;
        
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Compte_client() {
    }

    @Override
    public String toString() {
        return "Compte_client{" + "id_client=" + id_client + ", login=" + login + ", passwd=" + passwd + ", email=" + email + ", nom_client=" + nom_client + ", prenom_client=" + prenom_client + ", adresse_client=" + adresse_client + ", num_telephone_client=" + num_telephone_client + ", date_adhesion=" + date_adhesion + ", confirmation=" + confirmation + '}';
    }

    
    

    
    
    
}
