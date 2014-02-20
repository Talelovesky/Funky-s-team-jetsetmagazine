/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.AdministrateurDAO;
import edu.jetsetmagazine.entities.Administrateur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Talel
 */
public class testaddadmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Administrateur admin=new Administrateur("Med talel", "Karoui", "talel.karoui@esprit.tn", "+216 28513024", "admin3", "admin3");
        AdministrateurDAO admindao= new AdministrateurDAO();
        //admindao.insertAdmin(admin);
        //admindao.updateAdmin(admin);
        //admindao.deleteadministrateur(3);
        Administrateur adminrecherche;
        adminrecherche=admindao.findAdminByNom("Karoui");
        System.out.println(adminrecherche.toString());      
        
//        List<Administrateur> listadmin=new ArrayList<Administrateur>();
//        listadmin=admindao.DisplayAllAdministrateur();
//        for(Administrateur a:listadmin)
//        {
//            System.out.println(a.toString());
//            System.out.println("--------------------------------------------");
//        }
//        
        
        
    }
}
