/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelKategori;
import Model.ModelTransaksi;
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
public class TransaksiController extends ModelTransaksi{
    List<ModelTransaksi> list = new ArrayList<>();
    
    public void getAllData() throws IOException{
        //this.list = new ArrayList<>();
        BarangController brg = new BarangController();
        ShipController sh = new ShipController();
        PelangganController cus = new PelangganController();
        DaerahController loc = new DaerahController();
        DonationController don = new DonationController();
        
        int i;
        
        try {
            FileInputStream excelFile = new FileInputStream(new File(super.FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(3);
            Iterator<Row> iterator = sheet.iterator();
            iterator.next();
            
            while(iterator.hasNext()){
                Row currentRow = iterator.next();
                
                Cell ordID = currentRow.getCell(1);
                Cell ordDate = currentRow.getCell(2);
                Cell shipDate = currentRow.getCell(3);
                Cell smode = currentRow.getCell(4);
                Cell cusID = currentRow.getCell(5);
                Cell pos = currentRow.getCell(6);
                Cell product = currentRow.getCell(7);
                Cell harga = currentRow.getCell(8);
                Cell qty = currentRow.getCell(9);
                Cell dic = currentRow.getCell(10);
                Cell profit = currentRow.getCell(11);
                Cell donID = currentRow.getCell(12);
                Cell tot = currentRow.getCell(13);
                
                ModelTransaksi trs = new ModelTransaksi();
                trs.setOrderID(ordID.getStringCellValue());
                trs.setOrderDate(ordDate.getDateCellValue());
                trs.setShipDate(shipDate.getDateCellValue());
                trs.setShipMode(sh.searchObject(smode.toString()));
                trs.setPelanggan(cus.searchObject(cusID.toString()));
                trs.setPostal(loc.searchObject(pos.toString()));
                trs.setProduct(brg.searchObject(product.toString()));
                trs.setSales(harga.getNumericCellValue());
                trs.setQuantity((int) qty.getNumericCellValue());
                trs.setDiscount(dic.getNumericCellValue());
                trs.setProfit(profit.getNumericCellValue());
                if(donID != null){
                    trs.setDonation(don.searchObject(donID.toString()));
                } else {
                    trs.setDonation(null);
                }
                trs.setTotal(tot.getNumericCellValue());
                
                this.list.add(trs);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ModelTransaksi> getList() throws IOException{
        if(this.list.isEmpty()){
            getAllData();
        }
        return this.list;
    }
    
    public ModelTransaksi searchObject(String id) throws IOException{
        ModelTransaksi trs = new ModelTransaksi();
        
        if(this.list.isEmpty()){
            getAllData();
        }
        int i = 0;
        boolean ketemu = false;
        while(i<list.size() && !ketemu){
            String ID = list.get(i).getOrderID();

            trs = list.get(i);

            if(ID.equals(id)){
                ketemu = true;
            }

            i += 1;
        
        }
        
        return trs;
    }
}
