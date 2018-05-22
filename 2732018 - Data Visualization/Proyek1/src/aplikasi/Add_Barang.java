/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import Controller.BarangController;
import Controller.KategoriController;
import Controller.SubKategoriController;
import Model.ModelBarang;
import Model.ModelKategori;
import Model.ModelSubKategori;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tio
 */
public class Add_Barang extends javax.swing.JFrame {

    /**
     * Creates new form Add_Barang
     */
    private boolean createNewCat=false;
    
    public Add_Barang() {
        initComponents();
        setKategori();
    }
    
    private void setKategori() 
    {
        try {
            int i = 0;
            String[] aModel = new String[new KategoriController().getList().size()];
            Iterator<ModelKategori> kateg = new KategoriController().getList().iterator();
//            kateg.next();
            while(kateg.hasNext())
            {
                aModel[i++] = kateg.next().getKategori();
            }
            this.kategori.setModel(new javax.swing.DefaultComboBoxModel<>(aModel));
            
        } catch (IOException ex) {
            Logger.getLogger(Detail_Barang.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        produkID1 = new javax.swing.JTextField();
        produkName1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        createPanel = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        notnewCategory = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        IDcategory = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        IDsubcategory = new javax.swing.JTextField();
        subcategory = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox<>();
        subkategori = new javax.swing.JComboBox<>();
        newCategory = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        produkHarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel30.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel30.setText("ID Produk");
        jLabel30.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel31.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel31.setText(":");

        produkID1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        produkID1.setPreferredSize(new java.awt.Dimension(250, 20));
        produkID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkID1ActionPerformed(evt);
            }
        });

        produkName1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        produkName1.setPreferredSize(new java.awt.Dimension(250, 20));
        produkName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkName1ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel39.setText(":");

        jLabel40.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel40.setText("Nama Produk");
        jLabel40.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("Tambah Barang");

        cardPanel.setPreferredSize(new java.awt.Dimension(73, 63));
        cardPanel.setLayout(new java.awt.CardLayout());

        jLabel47.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel47.setText("Category");
        jLabel47.setPreferredSize(new java.awt.Dimension(93, 20));

        jLabel48.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel48.setText("Sub-Category");
        jLabel48.setPreferredSize(new java.awt.Dimension(93, 20));

        jLabel55.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel55.setText(":");

        jLabel49.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel49.setText(":");

        notnewCategory.setText("Choose Available Category");
        notnewCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notnewCategoryMouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel53.setText("ID Category");
        jLabel53.setPreferredSize(new java.awt.Dimension(93, 20));

        jLabel57.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel57.setText(":");

        jLabel54.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel54.setText("ID Sub-Category");
        jLabel54.setPreferredSize(new java.awt.Dimension(93, 20));

        jLabel58.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel58.setText(":");

        IDsubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDsubcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(notnewCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDcategory))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subcategory))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category))
                            .addGroup(createPanelLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDsubcategory)))
                        .addGap(10, 10, 10))))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addComponent(notnewCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(IDcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(IDsubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardPanel.add(createPanel, "card2");

        jLabel50.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel50.setText("Kategori");
        jLabel50.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel51.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel51.setText("Sub-Kategori");
        jLabel51.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel56.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel56.setText(":");

        jLabel52.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel52.setText(":");

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kategori.setPreferredSize(new java.awt.Dimension(250, 20));
        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });

        subkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        newCategory.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        newCategory.setText("<html> <p>Create New Category</p>");
        newCategory.setBorder(null);
        newCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newCategoryMouseClicked(evt);
            }
        });
        newCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(newCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)
                            .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.add(mainPanel, "card2");

        CreateButton.setText("Create");
        CreateButton.setPreferredSize(new java.awt.Dimension(86, 23));
        CreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButtonMouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel41.setText("Harga");
        jLabel41.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel42.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel42.setText(":");

        produkHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        produkHarga.setPreferredSize(new java.awt.Dimension(250, 20));
        produkHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produkHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(produkID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(produkName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(produkHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produkID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkID1ActionPerformed

    private void produkName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkName1ActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        try {
            List<String> temp = new ArrayList();
            int i = 0;
            Iterator<ModelSubKategori> a = new SubKategoriController().getList().iterator();
//            a.next();
            String Id = new KategoriController().getID(kategori.getSelectedItem().toString());
            while(a.hasNext()){
                ModelSubKategori cek = a.next();
                if(cek.getKategori().getId_kategori().equals(Id)){
                    temp.add(cek.getSubKategori());
                    i++;
                }
            }
            String[] bModel = new String[i];
            while(i>0){
                i--;
                bModel[i]=temp.get(i).toString();
            }
//            Iterator<ModelSubKategori> skateg = new SubKategoriController().getList().iterator();
//            skateg.next();
//            while(skateg.hasNext())
//            {
//                bModel[i++] = skateg.next().getSubKategori();
//            }
            this.subkategori.setModel(new javax.swing.DefaultComboBoxModel<>(bModel));
        } catch (IOException ex) {
            Logger.getLogger(Detail_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kategoriActionPerformed

    private void newCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCategoryActionPerformed

    private void IDsubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDsubcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDsubcategoryActionPerformed

    private void newCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCategoryMouseClicked
        this.createNewCat=true;
        this.cardPanel.removeAll();
        this.cardPanel.add(this.createPanel);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_newCategoryMouseClicked

    private void notnewCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notnewCategoryMouseClicked
        this.createNewCat=false;
        this.cardPanel.removeAll();
        this.cardPanel.add(this.mainPanel);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_notnewCategoryMouseClicked

    private void CreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButtonMouseClicked
        try {
            ModelBarang model = new ModelBarang();
            model.setProductID(this.produkID1.getText());
            model.setProductName(this.produkName1.getText());
            model.setPrice(Double.parseDouble(this.produkHarga.getText()));
            if(this.createNewCat){
                model.getSubcategory().getKategori().setKategori(this.category.getText());
                model.getSubcategory().setSubKategori(this.subcategory.getText());
                model.getSubcategory().getKategori().setId_kategori(this.IDcategory.getText());
                model.getSubcategory().setId_sub(this.IDsubcategory.getText());
            }else{
                try {
                    String kategori = this.kategori.getSelectedItem().toString();
                    String subkategori = this.subkategori.getSelectedItem().toString();
                    model.getSubcategory().getKategori().setKategori(kategori);
                    model.getSubcategory().setSubKategori(subkategori);
                    model.getSubcategory().getKategori().setId_kategori(new KategoriController().getID(kategori));
                    model.getSubcategory().setId_sub(new SubKategoriController().getID(subkategori));
                } catch (IOException ex) {
                    Logger.getLogger(Add_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            new BarangController().getList().add(model);
            new BarangController().add(model, createNewCat);
        } catch (IOException ex) {
            Logger.getLogger(Add_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CreateButtonMouseClicked

    private void produkHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkHargaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField IDcategory;
    private javax.swing.JTextField IDsubcategory;
    public javax.swing.JPanel cardPanel;
    private javax.swing.JTextField category;
    public javax.swing.JPanel createPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JComboBox<String> kategori;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JButton newCategory;
    private javax.swing.JButton notnewCategory;
    public javax.swing.JTextField produkHarga;
    public javax.swing.JTextField produkID1;
    public javax.swing.JTextField produkName1;
    private javax.swing.JTextField subcategory;
    private javax.swing.JComboBox<String> subkategori;
    // End of variables declaration//GEN-END:variables
}
