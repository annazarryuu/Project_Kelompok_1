/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelKategori;
import Model.ModelPelanggan;
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
public class PelangganController extends ModelPelanggan{
    private static List<ModelPelanggan> list = new ArrayList<>();
    
    public void getAllData() throws IOException{
        //this.list = new ArrayList<>();
        KategoriController kat = new KategoriController();
        
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(super.FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(2);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell cusId = currentRow.getCell(0);
                Cell cusName = currentRow.getCell(1);
                Cell seg = currentRow.getCell(2);
                
                ModelPelanggan pel = new ModelPelanggan();
                pel.setCustomerID(cusId.getStringCellValue());
                pel.setCustomerName(cusName.getStringCellValue());
                pel.setSegment(seg.getStringCellValue());
                
                this.list.add(pel);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelPelanggan> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllData();
        }
        return this.list;
    }
    
    public ModelPelanggan searchObject(String id) throws IOException{
        ModelPelanggan cus = new ModelPelanggan();
        
        if(this.list.isEmpty()){
            getAllData();
        }
        
        int i = 0;
        boolean ketemu = false;
        while(i<list.size() && !ketemu){
            String ID = list.get(i).getCustomerID();

            cus = list.get(i);

            if(ID.equals(id)){
                ketemu = true;
            }

            i += 1;
        }
        
        
        return cus;
    }
    
    public void showTable(JTable table1, Object[] isi) throws IOException{
        //{"Customer ID","Name","Segment"};
        List<ModelPelanggan> subList;
        DefaultTableModel A = new DefaultTableModel(null,isi);
        table1.setModel(A);
        
        subList = this.getList();
        
        if(!subList.isEmpty()){
            int size;
            
            size = subList.size();
            
            for(int i = 1;i < size;i++){
                isi[0] = subList.get(i).getCustomerID();
                isi[1] = subList.get(i).getCustomerName();
                isi[2] = subList.get(i).getSegment();
                        
                A.addRow(isi);
            }
        }
    }
    
}
