/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Asus
 */
public class TabelOpr {
    
    private static final String FILE_NAME = "*/../src/Excel/DataTransaksi.xlsx";
    DefaultTableModel A;
    JTextField dataType,type,size;
    
    public void selectRow(int rowIndex, JTextField f1, JTextField f2, JTextField f3){
        try{
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rowIndex);
         
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateRow(int rowIndex,String dataType, String type, int size){
        try{
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = null;
            
            cell = sheet.getRow(rowIndex).getCell(1);
            cell.setCellValue(dataType);
            cell = sheet.getRow(rowIndex).getCell(2);
            cell.setCellValue(type);
            cell = sheet.getRow(rowIndex).getCell(3);
            cell.setCellValue(size);
            
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteRow(int rowIndex){
        try{
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            
            int lastRowNum=sheet.getLastRowNum();
            
            if(rowIndex>=0&&rowIndex<lastRowNum){
                sheet.shiftRows(rowIndex+1,lastRowNum, -1);
            }
            if(rowIndex==lastRowNum){
                Row removingRow=sheet.getRow(rowIndex);
                if(removingRow!=null){
                    sheet.removeRow(removingRow);
                }
            }
            
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addRow(String dataType, String type, int size){
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            
            int rowNum = 0;

            while (iterator.hasNext()) {
                    rowNum++;
                    Row currentRow = iterator.next();
            }
            
            Row row = sheet.createRow(rowNum++);
            Cell cell = row.createCell(1);
            cell.setCellValue(dataType);
            cell = row.createCell(2);
            cell.setCellValue(type);
            cell = row.createCell(3);
            cell.setCellValue(size);
            
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TabelOpr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showTable(JTable table1, Object[] isi, int sheet){
        
        A = new DefaultTableModel(null,isi);
        table1.setModel(A);
        int i;

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(sheet);
            Iterator<Row> iterator = datatypeSheet.iterator();
            iterator.next();
            DataFormatter df = new DataFormatter();
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                
                Iterator<Cell> cellIterator = currentRow.iterator();
                i = 0;

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
//                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
////                        System.out.print(currentCell.getStringCellValue() + "--");
//                        isi[i] = currentCell.getStringCellValue();
//                    } else if (HSSFDateUtil.isCellDateFormatted(currentCell)) {
//                        System.out.println("Up");
//                        isi[i] = currentCell.getDateCellValue();
//                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
////                        System.out.print(currentCell.getNumericCellValue() + "--");
//                        isi[i] = currentCell.getNumericCellValue();
//                    }
                    
                    if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        if (DateUtil.isCellDateFormatted(currentCell)) {
                            Date tanggal = new Date(df.formatCellValue(currentCell));
                        }
                    }
                    
                    isi[i] = df.formatCellValue(currentCell);
                    
                    if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        if (DateUtil.isCellDateFormatted(currentCell)) {
                            Date tanggal = new Date((String)isi[i]);
                            SimpleDateFormat dt1 = new SimpleDateFormat("MM/dd/yyyy");
                            isi[i] = dt1.format(tanggal);
                        }
                    }
                    
                    i++;

                }
                System.out.println();
                A.addRow(isi);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void search(JTable table1, int sheet, int cell, String searched){
        Object[] isi = {"Row ID","Order ID","Order Date","Ship Date","Ship Mode","Customer ID","Postal Code","Product ID","Sales","Quantity","Discount","Profit"};
        A = new DefaultTableModel(null,isi);
        table1.setModel(A);
        int i,k;

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(sheet);
            Iterator<Row> iterator = datatypeSheet.iterator();
            iterator.next();
            k = 0;
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                i = 0;

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
//                        System.out.print(currentCell.getStringCellValue() + "--");
                        isi[i] = currentCell.getStringCellValue();                        
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
//                        System.out.print(currentCell.getNumericCellValue() + "--");
                        isi[i] = currentCell.getNumericCellValue();
                    }
                    i++;

                }
                System.out.println();
                if( k==0 || isi[cell].toString().contains(searched) ){
                    A.addRow(isi);
                }
                k++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
