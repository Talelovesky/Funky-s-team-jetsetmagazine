/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.gui;

import edu.jetsetmagazine.dao.Compte_clientDAO;
import edu.jetsetmagazine.dao.SoireeDAO;
import edu.jetsetmagazine.entities.Compte_client;
import edu.jetsetmagazine.entities.Soiree;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Talel
 */
public class MyTablemodelCompteclient extends AbstractTableModel{
    List<Compte_client> listecc = new ArrayList<>();
    String []header = {" Id compte client"," Login "," Mot de passe "," Nom Client "," Prénom Client "," Adresse Client "," Numéo téléphone "," Date adhésion "};

    public MyTablemodelCompteclient() { //remplissage de la liste des stocks
        Compte_clientDAO ccdao=new Compte_clientDAO();
        listecc=ccdao.DisplayAllCompteclient();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return listecc.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return listecc.get(rowIndex).getId_client();
            case 1://colonne type_vetement
                return listecc.get(rowIndex).getLogin();
            case 2://colonne quantité
                return listecc.get(rowIndex).getPasswd();
            case 3://colonne adresse depot
                return listecc.get(rowIndex).getNom_client();
            case 4://colonne adresse depot
                return listecc.get(rowIndex).getPrenom_client();    
            case 5://colonne adresse depot
                return listecc.get(rowIndex).getAdresse_client();
            case 6://colonne adresse depot
                return listecc.get(rowIndex).getNum_telephone_client(); 
            case 7://colonne adresse depot
                return listecc.get(rowIndex).getDate_adhesion();
            case 8://colonne adresse depot
                return listecc.get(rowIndex).getEmail();        
            default:
                return null;
        }
    }

        public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
    
}
