/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author ACER Z3-451
 */
public class ReadExcel {
    private String dataExcel = "", dataJava = "";
    private int sum = 0, i = 0, rows, cols;
    private boolean finish = false, akhir = false;
    private int m = 1;
    
    File file = new File ("src/Excel/Data Transaksi 2.xls");
 
    public ReadExcel () {
//        this.i = i;
    }
    
    void startRead (int i) throws Exception {
//        System.out.println ("Tes 3 ");
        Workbook wb = Workbook.getWorkbook(file);
//        System.out.println ("Tes 4 ");
        Sheet s = wb.getSheet(0);
        rows = s.getRows();
        cols = s.getColumns();
        
        Cell cell = s.getCell(m, i);
        dataExcel = cell.getContents();
//        dataJava = dataExcel;
        
//        System.out.println ("Tes 4 ");
        while (i < rows && !finish) {
            if (!dataExcel.equals(dataJava) && sum == 0) {
                dataJava = dataExcel;
                sum++; i++;
                System.out.println ("Isi yang baru..");
                System.out.println(dataJava);
                System.out.println ("Nilai Sum : "+sum);
                System.out.println ("Nilai Row : "+i);
                System.out.println ();
            } else if (dataExcel.equals(dataJava)) {
                sum++; i++;
                
                System.out.println(dataJava);
                System.out.println ("Nilai Sum : "+sum);
                System.out.println ("Nilai Row : "+i);
                System.out.println ();
            } else if (!dataExcel.equals(dataJava) && sum != 0) {
                System.out.println ("Finish..");
                finish = true;
            }
            if (i < rows) {
                cell = s.getCell(m, i);
                dataExcel = cell.getContents();
            }
        }
//        System.out.println(dataJava);
//        System.out.println ("Nilai Sum : "+sum);
//        System.out.println ("Nilai i : "+i);
//        System.out.println ();
        
        this.i = i;
    }
    
    void plusRows () {
        this.i = this.i+1;
    }
    
    int getRowsNow () {
        return i;
    }
    
    int getTotalRows () throws Exception {
        Workbook wb = Workbook.getWorkbook(file);
        Sheet s = wb.getSheet(0);
        
        return s.getRows();
    }
    
    int getSum () {
        return sum;
    }
    
    void setSum (int sum) {
        this.sum = sum;
    }
    
    String getDataJava () {
        return dataJava;
    }
    
    boolean getAkhir () {
        return akhir;
    }
    
    void setFinish (boolean finish) {
        this.finish = finish;
    }
    
    boolean getFinish () {
        return finish;
    }
    
    void setIndex (int m) {
        this.m = m;
    }
}
