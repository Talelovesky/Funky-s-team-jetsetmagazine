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
public class Theatre {
    private int code_theatre;
    private String nom_theatre;
    private String description_theatre;
    private String adresse_théatre;
    private Date date_theatre;

    public Theatre(String nom_theatre, String description_theatre, Date date_theatre, String adresse_théatre) {
        this.nom_theatre = nom_theatre;
        this.description_theatre = description_theatre;
        this.adresse_théatre = adresse_théatre;
        this.date_theatre = date_theatre;
    }

    public Theatre() {
    }

    @Override
    public String toString() {
        return "Theatre{" + "code_theatre=" + code_theatre + ", nom_theatre=" + nom_theatre + ", description_theatre=" + description_theatre + ", adresse_th\u00e9atre=" + adresse_théatre + ", date_theatre=" + date_theatre + '}';
    }

    
    
    
    
    
    
    public int getCode_theatre() {
        return code_theatre;
    }

    public String getNom_theatre() {
        return nom_theatre;
    }

    public String getDescription_theatre() {
        return description_theatre;
    }

    public String getAdresse_théatre() {
        return adresse_théatre;
    }

    public Date getDate_theatre() {
        return date_theatre;
    }

    public void setCode_theatre(int code_theatre) {
        this.code_theatre = code_theatre;
    }

    public void setNom_theatre(String nom_theatre) {
        this.nom_theatre = nom_theatre;
    }

    public void setDescription_theatre(String description_theatre) {
        this.description_theatre = description_theatre;
    }

    public void setAdresse_théatre(String adresse_théatre) {
        this.adresse_théatre = adresse_théatre;
    }

    public void setDate_theatre(Date date_theatre) {
        this.date_theatre = date_theatre;
    }
    
    
    
    
}
