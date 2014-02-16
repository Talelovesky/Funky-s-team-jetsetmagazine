/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.AdministrateurDAO;
import edu.jetsetmagazine.entities.Administrateur;

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
        Administrateur admin=new Administrateur("Med walid", "Karoui", "walid.karoui@esprit.tn", "+216 28513024", "admin2", "admin2");
        AdministrateurDAO admindao= new AdministrateurDAO();
        //admindao.insertAdmin(admin);
        //admindao.updateAdmin(admin);
        //admindao.deleteadministrateur(2);
        Administrateur adminrecherche= new Administrateur();
        adminrecherche=admindao.findAdminByNum(3);
        adminrecherche.toString();
    }
}
