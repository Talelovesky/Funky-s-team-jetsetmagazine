/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.TheatreDAO;
import edu.jetsetmagazine.entities.Theatre;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Talel
 */
public class theatretest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d=new Date(2013, 02, 28);
        Theatre t;
        t = new Theatre("el kqsqarrousssssaaaa", "c'est une piece théatrale cvvvvvzazertyujklm", d, "théatre municipal dis");
        TheatreDAO tdao=new TheatreDAO();
        tdao.inserttheatre(t);
        List<Theatre> listtheatre = new ArrayList<>();
        listtheatre=tdao.DisplayAllTheatre();
        
        for(Theatre t2:listtheatre)
        {
            System.out.println(t2.toString());
        }    
        
        
        
        //tdao.deleteTheatre(3);
        
        
    }
}
