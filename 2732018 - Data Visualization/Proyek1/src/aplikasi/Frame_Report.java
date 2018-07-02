/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import Controller.ReportController;
import Controller.TransaksiController;
import Model.ModelPenyimpananReport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Frame_Report extends javax.swing.JInternalFrame {

    ReportController rc = new ReportController();
    TransaksiController tc = new TransaksiController();
    ModelPenyimpananReport tblModel = new ModelPenyimpananReport();

    /**
     * Creates new form Frame_Report
     */
    public Frame_Report() {
        initComponents();
        tblReport.setModel(tblModel.getTable());
        writeTable("Januari", "2017");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        progBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1217, 715));
        setMinimumSize(new java.awt.Dimension(1217, 715));
        setPreferredSize(new java.awt.Dimension(1217, 715));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("INI DIISiKAN BULANNYA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DATA TRANSAKSI BULAN ");

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Order Date", "Ship Date", "Ship Mode", "Customer Name", "Postal Code", "Product Name", "Price", "Quantity", "Discount", "Profit", "Donation", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblReport);

        SaveButton.setText("SAVE REPORT AS EXCEL");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Write Excel File for Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progBar, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(534, 534, 534))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void writeTable(String month, String year) {
        String[] data = new String[13];
        int i;
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MMM - ''yy");

        try {
            for (i = 0; i < tc.getList().size(); i++) {
                SimpleDateFormat sdfMt = new SimpleDateFormat("MMMM");
                SimpleDateFormat sdfYr = new SimpleDateFormat("yyyy");

                String bln = sdfMt.format(tc.getList().get(i).getOrderDate());
                String thn = sdfYr.format(tc.getList().get(i).getOrderDate());

                if (bln.equals(month) && thn.equals(year)) {
                    data[0] = tc.getList().get(i).getOrderID();
                    data[1] = sdf.format(tc.getList().get(i).getOrderDate());
                    data[2] = sdf.format(tc.getList().get(i).getShipDate());
                    data[3] = tc.getList().get(i).getShipMode().getShipMode();
                    data[4] = tc.getList().get(i).getPelanggan().getCustomerName();
                    data[5] = tc.getList().get(i).getPostal().getPostalCode();
                    data[6] = tc.getList().get(i).getProduct().getProductName();
                    data[7] = String.valueOf(tc.getList().get(i).getSales());
                    data[8] = String.valueOf(tc.getList().get(i).getQuantity());
                    data[9] = String.valueOf(tc.getList().get(i).getDiscount());
                    data[10] = String.valueOf(tc.getList().get(i).getProfit());
                    data[11] = String.valueOf(tc.getList().get(i).getDonation());
                    data[12] = String.valueOf(tc.getList().get(i).getTotal());

                    tblModel.getTable().addRow(data);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Januari 2017");
        rc.setReportExcel("Januari", "2017", tc, progBar);
    }//GEN-LAST:event_SaveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progBar;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables
}
