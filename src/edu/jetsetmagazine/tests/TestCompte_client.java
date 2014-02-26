/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.Compte_clientDAO;
import edu.jetsetmagazine.entities.Compte_client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Talel
 */
public class TestCompte_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Compte_client cc=new Compte_client("Ted", "ted", "talel@esprit.tn", "tarek", "karoui", "sidi bou said", "125484");
        Compte_clientDAO ccdao=new Compte_clientDAO();
        
        //ccdao.inserercompteclient(cc);
        
        //ccdao.deleteCompte_client(4);
        
        Compte_client cc1=new Compte_client();
        cc1=ccdao.findcompteclientByID(5);
        System.out.println("---------------------------------------------------------------------");
        System.out.println(cc1.toString());
        
        List<Compte_client> list= new ArrayList<>();
        list=ccdao.DisplayAllCompteclient();
        
        for(Compte_client comptecClient:list)
        {
            System.out.println(comptecClient.toString());
            System.out.println("*******************************************************************************");
            
        }
        
        
        
    }
}
