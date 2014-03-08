/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.tests;

import edu.jetsetmagazine.dao.ImageDAO;
import edu.jetsetmagazine.dao.TheatreDAO;
import edu.jetsetmagazine.entities.Img;
import edu.jetsetmagazine.entities.Theatre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Talel
 */
public class MyTablemodelimage extends AbstractTableModel {
    List<Img> listimage = new ArrayList<>();
    String []header = {"Code image","Nom image","Date événement ","Descripion "};

    public MyTablemodelimage () { //remplissage de la liste des stocks
            ImageDAO idao=new ImageDAO();
        listimage=idao.DisplayAllimage();
    }
    
    @Override
    public int getRowCount() { //nombre de lignes de la table
        return listimage.size();
    }

    @Override
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return listimage.get(rowIndex).getId();
            case 1://colonne type_vetement
                return listimage.get(rowIndex).getName();
            case 2://colonne quantité
                return listimage.get(rowIndex).getDate_evenement();
            //case 3://colonne adresse depot
               // return listtheatre.get(rowIndex).getDate_theatre();
            case 3://colonne adresse depot
                return listimage.get(rowIndex).getDescription();    
            default:
                return null;
        }
    }

    @Override
        public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

    
}
