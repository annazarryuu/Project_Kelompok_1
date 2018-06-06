/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ACER Z3-451
 */
public class ReportController {

//    TransaksiController tc = new TransaksiController();

    public void setReportExcel(String month, String year) {
        try {
            FileOutputStream excelFile = new FileOutputStream(new File("*/../src/Excel/" + year + "/" + month + "Report.xlsx"));
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet(month + " Report");
//            Iterator<Row> iterator = sheet.iterator();
//            iterator.next();
            int i = 0, idRow = 0, idCell;
            boolean finish = false;

            while (i < 1) {
                SimpleDateFormat sdfMt = new SimpleDateFormat("MMMM");
                SimpleDateFormat sdfYr = new SimpleDateFormat("yyyy");

//                String bln = sdfMt.format(tc.getList().get(i).getOrderDate());
//                String thn = sdfYr.format(tc.getList().get(i).getOrderDate());

//                if (bln.equals(month) && thn.equals(year)) {
                    Row currentRow = sheet.createRow(idRow++);
                    idCell = 0;

                    Cell ordID = currentRow.createCell(idCell++);
                    Cell ordDate = currentRow.createCell(idCell++);
                    Cell shipDate = currentRow.createCell(idCell++);
                    Cell sMode = currentRow.createCell(idCell++);
                    Cell cusName = currentRow.createCell(idCell++);
                    Cell posCode = currentRow.createCell(idCell++);
                    Cell productName = currentRow.createCell(idCell++);
                    Cell harga = currentRow.createCell(idCell++);
                    Cell qty = currentRow.createCell(idCell++);
                    Cell dic = currentRow.createCell(idCell++);
                    Cell profit = currentRow.createCell(idCell++);
                    Cell don = currentRow.createCell(idCell++);
                    Cell tot = currentRow.createCell(idCell++);

                    sMode.setCellValue("Apa aja");
                    productName.setCellValue("Heloo");
                    ordID.setCellValue("Apa aja ADANYA");
                    cusName.setCellValue("Heloo SEMUA");

//                    ordID.setCellValue(tc.getList().get(i).getOrderID());
//                    ordDate.setCellValue(tc.getList().get(i).getOrderDate());
//                    shipDate.setCellValue(tc.getList().get(i).getShipDate());
//                    sMode.setCellValue(tc.getList().get(i).getShipMode().getShipID());
//                    cusName.setCellValue(tc.getList().get(i).getPelanggan().getCustomerName());
//                    posCode.setCellValue(tc.getList().get(i).getPostal().getPostalCode());
//                    productName.setCellValue(tc.getList().get(i).getProduct().getProductName());
//                    harga.setCellValue(tc.getList().get(i).getSales());
//                    qty.setCellValue(tc.getList().get(i).getQuantity());
//                    dic.setCellValue(tc.getList().get(i).getDiscount());
//                    profit.setCellValue(tc.getList().get(i).getProfit());
//                    don.setCellValue(tc.getList().get(i).getDonation());
//                    tot.setCellValue(tc.getList().get(i).getTotal());
//                }
                i++;
            }
            workbook.write(excelFile);
            workbook.close();
            Desktop.getDesktop().open(new File("*/../src/Excel/" + month + "Report.xlsx"));
            System.err.println("Finish");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
