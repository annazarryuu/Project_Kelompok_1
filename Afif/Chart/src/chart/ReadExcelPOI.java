/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

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
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ACER Z3-451
 */
public class ReadExcelPOI {

    File file = new File("src/Excel/DataTransaksi.xlsx");
    List<Model> list = new ArrayList<>();
    private Model model = new Model();
//    List

    public void startReadExcel() {

        try {
            FileInputStream excelFile = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();

//                Cell idTrk = currentRow.getCell(0);
//                Cell tglTrk = currentRow.getCell(1);
//                Cell produk = currentRow.getCell(2);
//                Cell mode = currentRow.getCell(3);
//                Cell harga = currentRow.getCell(4);
//                Cell qty = currentRow.getCell(5);
//                Cell donasiUnit = currentRow.getCell(6);
//                Cell jml = currentRow.getCell(7);
//                
//                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//                dataset.addValue(value, file, file);
                Cell no = currentRow.getCell(1);
                Cell produk = currentRow.getCell(3);
                Cell harga = currentRow.getCell(5);
                Cell qty = currentRow.getCell(6);

                model.setValue((int) harga.getNumericCellValue());
                System.out.println("Value : " + model.getValue());

                model.setCategory(String.valueOf(no.getNumericCellValue()));
                System.out.println("Category : " + model.getCategory());

                model.setLineItem("Penjualan");
                System.out.println("Line : " + model.getLineItem() + "\n");

                this.list.add(model);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void readPieData() {
        short idx;
        boolean ketemu;

        try {
            FileInputStream excelFile = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();

                Cell modeShip = currentRow.getCell(4);
                model.setCategory(modeShip.getStringCellValue());
                idx = 0;
                ketemu = false;
                System.out.println("Size : "+list.size());
                while (idx < list.size() && !ketemu) {
                    if (list.isEmpty()) {
                        model.setValue(1);
                        this.list.add(model);
                        ketemu = true;
                    } else if (!list.isEmpty() && model.getCategory().equals(list.get(idx).getCategory())) {
                        this.list.get(idx).setValue(this.list.get(idx).getValue() + 1);
                        ketemu = true;
                    } else if (!list.isEmpty() && model.getCategory().equals(list.get(idx).getCategory())) {
                        idx++;
                    }
                }
                if (!ketemu) {
                    model.setValue(1);
                    this.list.add(model);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void readLineData() {
        short idx, num = 0;
        boolean ketemu;
        try {
            FileInputStream excelFile = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();

            model.setLineItem("Kasur");
            this.list.add(model);

            model.setLineItem("Buku");
            this.list.add(model);

            model.setLineItem("Laptop");
            this.list.add(model);

            model.setLineItem("Smartphone");
            this.list.add(model);

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();

                Cell harga = currentRow.getCell(5);
                Cell barang = currentRow.getCell(3);

                idx = 0;
                num++;
//                ketemu = false;
                String categori = String.valueOf(num);
                System.out.println("Size 1 : "+list.size());
                while (idx < list.size()) {
                    if (list.get(idx).getLineItem().equals(barang.getStringCellValue())) {
                        list.get(idx).setValue((int) harga.getNumericCellValue());
                        list.get(idx).setCategory(categori);
                        System.out.println("If satu");
                    } else {
                        list.get(idx).setValue(0);
                        list.get(idx).setCategory(categori);
                        System.out.println("else dua");
                    }
                    idx++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    DefaultCategoryDataset readTesLine () {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            FileInputStream excelFile = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(9);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                
                Cell tahun = currentRow.getCell(0);
                Cell bulan = currentRow.getCell(1);
                Cell jumlah = currentRow.getCell(2);
                
                dataset.addValue(jumlah.getNumericCellValue(), "Penjualan", bulan.getStringCellValue());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadExcelPOI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataset;
    }
    
    public List<Model> getList() {
        return list;
    }
}
