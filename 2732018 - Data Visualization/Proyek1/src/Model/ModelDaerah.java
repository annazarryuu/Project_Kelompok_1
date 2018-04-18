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
public class ModelDaerah {

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    public void getAllDaerah() throws IOException{
        //this.list = new ArrayList<ModelKategori>();
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
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
            getAllDaerah();
        }
        
        return list;
    }
    
    public ModelDaerah searchObject(String id) throws IOException{
        ModelDaerah mdl = new ModelDaerah();
        
        if(this.list.isEmpty()){
            getAllDaerah();
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
    
    private static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    
    private String postalCode;
    private String region;
    private String country;
    private String city;
    private String state;
    private List<ModelDaerah> list = new ArrayList<>();
}
