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
    
    public static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    
    private String id_sub;
    private ModelKategori kategori;
    private String subKategori;
}
