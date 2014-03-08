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
public class Img {
    private int id;
    private String name;
    private Date date_evenement;
    private String description;
    private String location;

    public Img(String name, String location, Date date_evenement, String description) {
        this.name = name;
        this.location = location;
        this.date_evenement = date_evenement;
        this.description = description;
        
       
        
    }

    public Img() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate_evenement() {
        return date_evenement;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate_evenement(Date date_evenement) {
        this.date_evenement = date_evenement;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Img{" + "id=" + id + ", name=" + name + ", date_evenement=" + date_evenement + ", description=" + description + ", location=" + location + '}';
    }
    
    
    
    
}
