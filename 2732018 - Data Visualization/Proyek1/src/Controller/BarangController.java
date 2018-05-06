/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelBarang;
import Model.ModelKategori;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Gibran
 */
public class BarangController extends ModelBarang{
    private static List<ModelBarang> list = new ArrayList<>();
    
    public void getAllData() throws IOException{
        //this.list = new ArrayList<>();
        SubKategoriController data = new SubKategoriController();
        
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(super.FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell id = currentRow.getCell(0);
                Cell cat = currentRow.getCell(1);
                Cell name = currentRow.getCell(2);
                
                ModelBarang brg = new ModelBarang();

                brg.setProductID(id.toString());
                brg.setSubcategory(data.searchObject(cat.toString()));
                brg.setProductName(name.toString());
                
                this.list.add(brg);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelBarang> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllData();
        }
        return this.list;
    }
    
    public ModelBarang searchObject(String id) throws IOException{
        ModelBarang brg = new ModelBarang();
        
        if(this.list.isEmpty()){
            getAllData();
        }
        int i = 0;
        boolean ketemu = false;
        while(i<list.size() && !ketemu){
            String ID = list.get(i).getProductID();

            brg = list.get(i);

            if(ID.equals(id)){
                ketemu = true;
            }

            i += 1;
        
        }
        
        return brg;
    }
    
    public void showTable(JTable table1, Object[] isi) throws IOException{
        BarangController sub = new BarangController();
        List<ModelBarang> subList;
        DefaultTableModel A = new DefaultTableModel(null,isi);
        table1.setModel(A);
        
        subList = sub.getList();
        
        if(!subList.isEmpty()){
            int size;
            
            size = subList.size();
            
            A.addRow(isi);
            
            for(int i = 1;i < size;i++){
                isi[0] = subList.get(i).getProductID();
                isi[1] = subList.get(i).getSubcategory().getKategori().getKategori();
                isi[2] = subList.get(i).getSubcategory().getSubKategori();
                isi[3] = subList.get(i).getProductName();
                
                A.addRow(isi);
            }
        }
    }
}
