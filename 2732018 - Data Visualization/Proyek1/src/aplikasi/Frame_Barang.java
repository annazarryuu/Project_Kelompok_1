/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import Controller.BarangController;
import Model.ModelBarang;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frame_Barang extends javax.swing.JInternalFrame {

    TabelOpr A = new TabelOpr();
    Object[] isi = {"Product ID","Category","Sub-Category","Product Name","Product Price"};
    Controller.BarangController Brg = new BarangController();
    boolean admin;
    public Frame_Barang(boolean admin) {
        try {
            initComponents();
            setAdmin(admin);
            Brg.showTable(t_barang, isi);
            if(!admin){
                addBarang.setVisible(false);
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBy = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JTextField();
        searchOn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_barang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        addBarang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1217, 715));

        searchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Category", "Sub-Category", "Product Name" }));

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

        t_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        t_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_barang);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2), "Filtering"));

        jLabel13.setText("Product Category");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Furniture", "Office Supplies", "Technology" }));
        jComboBox7.setBorder(null);
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });

        jLabel20.setText(":");

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("FILTER");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox8.setBorder(null);

        jLabel21.setText("Product Sub-Category");

        jLabel22.setText(":");

        addBarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBarang.setText("Add Product");
        addBarang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBarangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(241, 241, 241)
                .addComponent(addBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(addBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("List Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchBy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchOn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(searchOn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchOnMouseClicked
        // TODO add your handling code here:
        String cari = searchBox.getText();
        int cell = searchBy.getSelectedIndex();
        try {
            A.search(t_barang, 4, cell, cari);
        } catch (IOException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchOnMouseClicked

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
        // TODO add your handling code here:
        int state = jComboBox7.getSelectedIndex();
        
        switch(state){
            case 0 : jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" })); break;
            case 1 : jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bookcases", "Chairs", "Furnishings", "Tables" })); break;
            case 2 : jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Appliances", "Art", "Binders", "Envelopes", "Fasteners", "Labels", "Paper", "Storage", "Supplies" })); break;
            case 3 : jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Copiers", "Machines", "Phones" })); break;
        }
    }//GEN-LAST:event_jComboBox7ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String kategori = (String) jComboBox7.getSelectedItem();
        String subKategori = (String) jComboBox8.getSelectedItem();
        
        if(kategori.length() == 0) {
            kategori = null;
        }
        
        if(subKategori.length() == 0) {
            subKategori = null;
        }
        
        try {
            A.FilterBarang(t_barang, isi, kategori, subKategori);
        } catch (IOException ex) {
            Logger.getLogger(Frame_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_barangMouseClicked
        try {
            int row = t_barang.getSelectedRow();
            String klik = (t_barang.getModel().getValueAt(row, 0).toString());
            Boolean ketemu=false;
            List<ModelBarang> lis3 = new BarangController().getList();
            Iterator<ModelBarang> iterator3 = lis3.iterator();
            ModelBarang hsl = iterator3.next();
            Detail_Barang a = new Detail_Barang();
            
            while (!ketemu && iterator3.hasNext())
            {
                if(hsl.getProductID().equals(klik)){      
                    ketemu=true;
                    a.cardPanel.removeAll();
                    a.cardPanel.add(a.mainPanel);
                    a.produkID.setText(hsl.getProductID());
                    a.produkID1.setText(hsl.getProductID());
                    a.produkName.setText(hsl.getProductName());
                    a.produkName1.setText(hsl.getProductName());
                    a.kategori.setText(hsl.getSubcategory().getKategori().getKategori());
                    a.subkategori.setText(hsl.getSubcategory().getSubKategori());
                    a.produkPrice.setText(String.valueOf(hsl.getPrice()));
                    a.produkHarga.setText(String.valueOf(hsl.getPrice()));
                    if(!admin){  //cek admin
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
    }//GEN-LAST:event_t_barangMouseClicked

    private void addBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBarangMouseClicked
        Add_Barang a = new Add_Barang();
        a.cardPanel.removeAll();
        a.cardPanel.add(a.mainPanel);
        a.repaint();
        a.revalidate();
        a.setVisible(true);
    }//GEN-LAST:event_addBarangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBarang;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JComboBox<String> searchBy;
    private javax.swing.JButton searchOn;
    private javax.swing.JTable t_barang;
    // End of variables declaration//GEN-END:variables
}
