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
public class ModelBarang {

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the subcategory
     */
    public ModelSubKategori getSubcategory() {
        return subcategory;
    }

    /**
     * @param subcategory the subcategory to set
     */
    public void setSubcategory(ModelSubKategori subcategory) {
        this.subcategory = subcategory;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void getAllBarang() throws IOException{
        //this.list = new ArrayList<>();
        ModelSubKategori kat = new ModelSubKategori();
        
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            int num = sheet.getPhysicalNumberOfRows();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell id = currentRow.getCell(0);
                Cell cat = currentRow.getCell(1);
                Cell name = currentRow.getCell(2);
                
                ModelBarang brg = new ModelBarang();

                brg.setProductID(id.toString());
                brg.setSubcategory(kat.searchObject(cat.toString()));
                brg.setProductName(name.toString());
                
                this.list.add(brg);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelBarang> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllBarang();
        }
        return this.list;
    }
    
    public ModelBarang searchObject(String id) throws IOException{
        ModelBarang brg = new ModelBarang();
        
        if(this.list.isEmpty()){
            getAllBarang();
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
    
    private static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    
    private String productID;
    private ModelSubKategori subcategory;
    private String productName;
    
    private List<ModelBarang> list = new ArrayList<>();
}
