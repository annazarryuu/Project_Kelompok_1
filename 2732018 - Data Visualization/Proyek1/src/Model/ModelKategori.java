/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Gibran
 */
public class ModelKategori {

    /**
     * @return the id_kategori
     */
    public String getId_kategori() {
        return id_kategori;
    }

    /**
     * @param id_kategori the id_kategori to set
     */
    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public void getAllKategori() throws IOException{
        //this.list = new ArrayList<ModelKategori>();
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(4);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell idKategori = currentRow.getCell(0);
                Cell Kategori = currentRow.getCell(1);
                
                ModelKategori kategori = new ModelKategori();
                kategori.setId_kategori(idKategori.toString());
                kategori.setKategori(Kategori.toString());
                
                this.list.add(kategori);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelKategori> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllKategori();
        }
        
        return list;
    }
    
    public ModelKategori searchObject(String id) throws IOException{
        ModelKategori kat = new ModelKategori();
        
        //if(this.list.isEmpty()){
            getAllKategori();
        //}else{
            int i = 0;
            boolean ketemu = false;
            while(i<list.size() && !ketemu){
                String ID = list.get(i).getId_kategori();
                
                kat = list.get(i);
                
                if(ID.equals(id)){
                    ketemu = true;
                }
                
                i += 1;
            }
        //}
        
        return kat;
    }
    
    private static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    
    private String id_kategori;
    private String kategori;
    private List<ModelKategori> list = new ArrayList<ModelKategori>();
}
