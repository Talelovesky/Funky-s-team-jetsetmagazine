/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.gui;


import edu.jetsetmagazine.dao.TheatreDAO;

import edu.jetsetmagazine.entities.Theatre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Talel
 */
public class Mytablemodeltheatre extends AbstractTableModel
{

    
    List<Theatre> listtheatre = new ArrayList<>();
    String []header = {"Code théatre","Nom théatre","Description théatre","Date théatre","Adresse théatre"};

    public Mytablemodeltheatre() { //remplissage de la liste des stocks
        TheatreDAO tdao=new TheatreDAO();
        listtheatre=tdao.DisplayAllTheatre();
    }
    
    @Override
    public int getRowCount() { //nombre de lignes de la table
        return listtheatre.size();
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
                return listtheatre.get(rowIndex).getCode_theatre();
            case 1://colonne type_vetement
                return listtheatre.get(rowIndex).getNom_theatre();
            case 2://colonne quantité
                return listtheatre.get(rowIndex).getDescription_theatre();
            case 3://colonne adresse depot
                return listtheatre.get(rowIndex).getDate_theatre();
            case 4://colonne adresse depot
                return listtheatre.get(rowIndex).getAdresse_théatre();    
            default:
                return null;
        }
    }

    @Override
        public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

    
}
