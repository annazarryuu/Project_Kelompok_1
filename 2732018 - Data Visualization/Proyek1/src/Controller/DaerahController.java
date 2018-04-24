/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDaerah;
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
public class DaerahController extends ModelDaerah{
    private List<ModelDaerah> list = new ArrayList<>();
    
    public void getAllData() throws IOException{
        //this.list = new ArrayList<ModelKategori>();
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(super.FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(1);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell pos = currentRow.getCell(0);
                Cell reg = currentRow.getCell(1);
                Cell ctry = currentRow.getCell(2);
                Cell cty = currentRow.getCell(3);
                Cell st = currentRow.getCell(4);
                
                ModelDaerah mod = new ModelDaerah();
                int X = (int) pos.getNumericCellValue();
                
                mod.setPostalCode(String.valueOf(X));
                mod.setRegion(reg.getStringCellValue());
                mod.setCountry(ctry.getStringCellValue());
                mod.setCity(cty.getStringCellValue());
                mod.setState(st.getStringCellValue());
                
                this.list.add(mod);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelDaerah> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllData();
        }
        
        return list;
    }
    
    public ModelDaerah searchObject(String id) throws IOException{
        ModelDaerah mdl = new ModelDaerah();
        
        if(this.list.isEmpty()){
            getAllData();
        }
        
        int i = 0;
        boolean ketemu = false;
        while(i<list.size() && !ketemu){
            String ID = list.get(i).getPostalCode();

            mdl = list.get(i);

            if(ID.equals(id)){
                ketemu = true;
            }

            i += 1;
        }
        
        return mdl;
    }
    
    public void showTable(JTable table1, Object[] isi) throws IOException{
        //{"Postal Code","Region","Country","City","State"};
        List<ModelDaerah> subList;
        DefaultTableModel A = new DefaultTableModel(null,isi);
        table1.setModel(A);
        
        subList = this.getList();
        
        if(!subList.isEmpty()){
            int size;
            
            size = subList.size();
            
            for(int i = 1;i < size;i++){
                isi[0] = subList.get(i).getPostalCode();
                isi[1] = subList.get(i).getRegion();
                isi[2] = subList.get(i).getCountry();
                isi[3] = subList.get(i).getCity();
                isi[4] = subList.get(i).getState();
                
                A.addRow(isi);
            }
        }
    }
    
}
