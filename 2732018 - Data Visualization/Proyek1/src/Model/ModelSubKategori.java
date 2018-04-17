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
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Gibran
 */
public class ModelSubKategori {

    /**
     * @return the id_sub
     */
    public String getId_sub() {
        return id_sub;
    }

    /**
     * @param id_sub the id_suB to set
     */
    public void setId_sub(String id_suB) {
        this.id_sub = id_suB;
    }

    /**
     * @return the kategori
     */
    public ModelKategori getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(ModelKategori kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the subKategori
     */
    public String getSubKategori() {
        return subKategori;
    }

    /**
     * @param subKategori the subKategori to set
     */
    public void setSubKategori(String subKategori) {
        this.subKategori = subKategori;
    }
    
    public void getAllSub() throws IOException{
        //this.list = new ArrayList<>();
        ModelKategori kat = new ModelKategori();
        
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(5);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            int num = sheet.getPhysicalNumberOfRows();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell idsub = currentRow.getCell(0);
                Cell cat = currentRow.getCell(1);
                Cell subcat = currentRow.getCell(2);
                
                ModelSubKategori sub = new ModelSubKategori();
                sub.setId_sub(idsub.toString());
                sub.setKategori(kat.searchObject(cat.toString()));
                sub.setSubKategori(subcat.toString());
                
                this.list.add(sub);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelSubKategori> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllSub();
        }
        return this.list;
    }
    
    public ModelSubKategori searchObject(String id) throws IOException{
        ModelSubKategori kat = new ModelSubKategori();
        
        if(this.list.isEmpty()){
            getAllSub();
        }
        
        int i = 0;
        boolean ketemu = false;
        while(i<list.size() && !ketemu){
            String ID = list.get(i).id_sub;

            kat = list.get(i);

            if(ID.equals(id)){
                ketemu = true;
            }

            i += 1;
        }
        
        
        return kat;
    }
    
    private static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    
    private String id_sub;
    private ModelKategori kategori;
    private String subKategori;
    
    private List<ModelSubKategori> list = new ArrayList<>();
}
