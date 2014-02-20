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
public class Soiree {
    private int code_soiree;
    private String nom_soiree;
    private String description_soiree;
    private Date date_soiree;
    private String adresse_soiree;

    public Soiree(String nom_soiree, String description_soiree, Date date_soiree, String adresse_soiree) {
        this.nom_soiree = nom_soiree;
        this.description_soiree = description_soiree;
        this.date_soiree = date_soiree;
        this.adresse_soiree = adresse_soiree;
    }

    public Soiree()
    {
        
    }
    public int getCode_soiree() {
        return code_soiree;
    }

    public String getNom_soiree() {
        return nom_soiree;
    }

    public String getDescription_soiree() {
        return description_soiree;
    }

    public Date getDate_soiree() {
        return date_soiree;
    }

    public String getAdresse_soiree() {
        return adresse_soiree;
    }

    public void setCode_soiree(int code_soiree) {
        this.code_soiree = code_soiree;
    }

    public void setNom_soiree(String nom_soiree) {
        this.nom_soiree = nom_soiree;
    }

    public void setDescription_soiree(String description_soiree) {
        this.description_soiree = description_soiree;
    }

    public void setDate_soiree(Date date_soiree) {
        this.date_soiree = date_soiree;
    }

    public void setAdresse_soiree(String adresse_soiree) {
        this.adresse_soiree = adresse_soiree;
    }

    @Override
    public String toString() {
        return "Soiree{" + "code_soiree=" + code_soiree + ", nom_soiree=" + nom_soiree + ", description_soiree=" + description_soiree + ", date_soiree=" + date_soiree + ", adresse_soiree=" + adresse_soiree + '}';
    }
    
    
}
