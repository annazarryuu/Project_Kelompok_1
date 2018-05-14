/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import Controller.DaerahController;
import Model.ModelDaerah;
import java.io.File;
import java.io.FileInputStream;
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

public class Frame_Lokasi extends javax.swing.JInternalFrame {

    TabelOpr A = new TabelOpr();
    DaerahController d = new DaerahController();
    Object[] isi = {"Postal Code", "Region", "Country", "City", "State"};
    public Frame_Lokasi() {
        try {
            initComponents();
            d.showTable(t_lokasi, isi);
        } catch (IOException ex) {
            Logger.getLogger(Frame_Lokasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchOn = new javax.swing.JButton();
        searchBy = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_lokasi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        searchOn.setBackground(new java.awt.Color(0, 0, 51));
        searchOn.setForeground(new java.awt.Color(255, 255, 255));
        searchOn.setText("Search");
        searchOn.setBorder(null);
        searchOn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchOn.setMargin(new java.awt.Insets(20, 24, 20, 24));
        searchOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchOnMouseClicked(evt);
            }
        });

        searchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Postal Code", "Region", "Country", "City", "State" }));

        t_lokasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_lokasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_lokasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_lokasi);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2), "Filtering"));

        jLabel7.setText("Region");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "West", "Central", "East", "South" }));
        jComboBox1.setBorder(null);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel10.setText(":");

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FILTER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox2.setBorder(null);

        jLabel14.setText("City");

        jLabel15.setText(":");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("List Lokasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchBy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchOn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(searchOn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOnMouseClicked
        // TODO add your handling code here:
        String cari = searchBox.getText();
        int cell = searchBy.getSelectedIndex();
        try {
            A.search(t_lokasi, 1, cell, cari);
        } catch (IOException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchOnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String region = (String) jComboBox1.getSelectedItem();
        String city = (String) jComboBox2.getSelectedItem();
        
        if(region.length() == 0) {
            region = null;
        }
        
        if(city.length() == 0) {
            city = null;
        }
        
        try {
            A.FilterLokasi(t_lokasi, isi, region, city);
        } catch (IOException ex) {
            Logger.getLogger(Frame_Lokasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            // TODO add your handling code here:
            int state = jComboBox1.getSelectedIndex();
            int cellIndex =  state - 1;
            List<String> listString = new ArrayList<>();
            
            if(cellIndex > -1) {
                FileInputStream excelFile = new FileInputStream(new File("*/../src/Excel/DataTransaksi.xlsx"));
                Workbook workbook = new XSSFWorkbook(excelFile);
                Sheet sheet = workbook.getSheet("Lokasi");
                Iterator<Row> iterator = sheet.iterator();
                iterator.next();

                Row currentRow = iterator.next();            
                while(iterator.hasNext() && currentRow.getCell(cellIndex) != null) {
                    Cell element = currentRow.getCell(cellIndex);
                    listString.add(element.getStringCellValue());
                    currentRow = iterator.next();
                }

                String[] arrayString = new String[listString.size() + 1];
                arrayString[0] = "";

                int i = 1;
                for(String elmnt : listString) {
                    arrayString[i] = elmnt;
                    i++;
                }

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
                
            } else {
                String[] arrayString = new String[1];
                arrayString[0] = "";
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(arrayString));
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame_Lokasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void t_lokasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_lokasiMouseClicked
        try {
            int row = t_lokasi.getSelectedRow();
            String klik = (t_lokasi.getModel().getValueAt(row, 0).toString());
            Boolean ketemu=false;
            List<ModelDaerah> lis3 = new DaerahController().getList();
            Iterator<ModelDaerah> iterator3 = lis3.iterator();
            ModelDaerah hsl = iterator3.next();
            Detail_Lokasi a = new Detail_Lokasi();
            
            while (!ketemu && iterator3.hasNext())
            {
                if(hsl.getPostalCode().equals(klik)){      
                    ketemu=true;
                    a.cardPanel.removeAll();
                    a.cardPanel.add(a.mainPanel);
                    a.kodePos.setText(hsl.getPostalCode());
                    a.kodePos1.setText(hsl.getPostalCode());
                    a.negara.setText(hsl.getState());
                    a.negara1.setText(hsl.getState());
                    a.wilayah.setText(hsl.getRegion());
                    a.wilayah1.setText(hsl.getRegion());
                    a.provinsi.setText(hsl.getCountry());
                    a.provinsi1.setText(hsl.getCountry());
                    a.kota.setText(hsl.getCity());
                    a.kota1.setText(hsl.getCity());
                    if(!true){  //cek admin
                        a.EditButton.setVisible(false);
                        a.DeleteButton.setVisible(false);
                    }
                    a.setVisible(true);
                }
                hsl = iterator3.next();
            }
        } catch (IOException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_t_lokasiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JComboBox<String> searchBy;
    private javax.swing.JButton searchOn;
    private javax.swing.JTable t_lokasi;
    // End of variables declaration//GEN-END:variables
}
