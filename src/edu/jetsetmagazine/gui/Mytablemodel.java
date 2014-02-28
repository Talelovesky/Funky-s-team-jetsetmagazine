/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.gui;

import edu.jetsetmagazine.dao.SoireeDAO;
import edu.jetsetmagazine.entities.Soiree;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Talel
 */
public class Mytablemodel extends AbstractTableModel{
    
    List<Soiree> listsoiree = new ArrayList<>();
    String []header = {"Code soiree","Nom soiree","Description Soiree","Date soiree","Adresse soiree"};

    public Mytablemodel() { //remplissage de la liste des stocks
        SoireeDAO soireedao=new SoireeDAO();
        listsoiree=soireedao.DisplayAllSoiree();
    }
    
    @Override
    public int getRowCount() { //nombre de lignes de la table
        return listsoiree.size();
    }

    @Override
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return listsoiree.get(rowIndex).getCode_soiree();
            case 1://colonne type_vetement
                return listsoiree.get(rowIndex).getNom_soiree();
            case 2://colonne quantité
                return listsoiree.get(rowIndex).getDescription_soiree();
            case 3://colonne adresse depot
                return listsoiree.get(rowIndex).getDate_soiree();
            case 4://colonne adresse depot
                return listsoiree.get(rowIndex).getAdresse_soiree();    
            default:
                return null;
        }
    }

        public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

    
}
