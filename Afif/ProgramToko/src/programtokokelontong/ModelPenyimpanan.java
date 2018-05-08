/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtokokelontong;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER Z3-451
 */
public class ModelPenyimpanan {
    private DefaultTableModel table = new DefaultTableModel ();
    
    public ModelPenyimpanan () {
//        getTable().addColumn("No");
//        getTable().addColumn("Nama");
//        getTable().addColumn("Harga");
//        getTable().addColumn("Jumlah");
//        getTable().addColumn("Total");
        
        table.addColumn("No");
        table.addColumn("Nama");
        table.addColumn("Harga");
        table.addColumn("Jumlah");
        table.addColumn("Total");
    }
    
    public DefaultTableModel getTable () {
        return table;
    }
    
    public void setTable (DefaultTableModel table) {
        this.table = table;
    }
}
