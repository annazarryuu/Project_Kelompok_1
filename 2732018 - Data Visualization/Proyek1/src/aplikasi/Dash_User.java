/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import Controller.KeranjangController;
import Model.ModelKeranjang;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gibran
 */
public class Dash_User extends javax.swing.JFrame {

    int start;
    int end;
    int max = 0;
    
    List<ModelKeranjang> shopCart = new KeranjangController().getList();
    double jambleh = new KeranjangController().getTotal();

    /**
     * Creates new form Dash_User
     */
    public Dash_User() {
        initComponents();
//        userLabel.setText(username);
//        start = 0;
//        end = 15;
//        Frame_Grid_Barang grid = new Frame_Grid_Barang();
//
//        max = max == 0 ? grid.getMax() : max;
//
//        konten.removeAll();
//        konten.add(grid);
//        grid.setVisible(true);
//        
//        btnPrev.setEnabled(this.start > 0);
    }
    
    public Dash_User(String username) {
        initComponents();
        userLabel.setText(username);
        start = 0;
        end = 15;
        Frame_Grid_Barang grid = new Frame_Grid_Barang();

        max = max == 0 ? grid.getMax() : max;

        konten.removeAll();
        konten.add(grid);
        grid.setVisible(true);
        
        btnPrev.setEnabled(this.start > 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        a_transaksi = new javax.swing.JLabel();
        a_barang = new javax.swing.JLabel();
        a_lokasi = new javax.swing.JLabel();
        a_pelanggan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        a_login = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        konten = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 238, 224));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        a_transaksi.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        a_transaksi.setForeground(new java.awt.Color(0, 0, 51));
        a_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transaction.png"))); // NOI18N
        a_transaksi.setText("Keranjang");
        a_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_transaksiMouseClicked(evt);
            }
        });

        a_barang.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        a_barang.setForeground(new java.awt.Color(0, 0, 51));
        a_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barang.png"))); // NOI18N
        a_barang.setText("Barang");
        a_barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_barangMouseClicked(evt);
            }
        });

        a_lokasi.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        a_lokasi.setForeground(new java.awt.Color(0, 0, 51));
        a_lokasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/location.png"))); // NOI18N
        a_lokasi.setText("Lokasi");
        a_lokasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a_lokasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_lokasiMouseClicked(evt);
            }
        });

        a_pelanggan.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        a_pelanggan.setForeground(new java.awt.Color(0, 0, 51));
        a_pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        a_pelanggan.setText("Pelanggan");
        a_pelanggan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_pelangganMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 238, 224));
        jLabel2.setText("Kelompok 1 - Proyek 1");

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 238, 224));
        jLabel3.setText("D4 - Teknik Informatika");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 238, 224));
        jLabel4.setText("JTK POLBAN 2017");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        a_login.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        a_login.setForeground(new java.awt.Color(0, 0, 51));
        a_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        a_login.setText("Logout");
        a_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_loginMouseClicked(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 51));
        userLabel.setText("Hallo Username !");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mansmall.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(a_pelanggan)
                        .addComponent(a_login))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a_login)
                .addGap(141, 141, 141)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        konten.setBackground(new java.awt.Color(250, 250, 250));
        konten.setPreferredSize(new java.awt.Dimension(930, 300));

        javax.swing.GroupLayout kontenLayout = new javax.swing.GroupLayout(konten);
        konten.setLayout(kontenLayout);
        kontenLayout.setHorizontalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        kontenLayout.setVerticalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(218, 238, 224));

        btnPrev.setText("Previous");
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(589, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(konten, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(konten, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_transaksiMouseClicked
//        Frame_Transaksi ft = new Frame_Transaksi();
//        konten.removeAll();
//        konten.add(ft);
//        ft.setVisible(true);
//          = cart.getList();
         JOptionPane.showMessageDialog(null, "Jumlah Data di Cart : " + shopCart.size());
         int i = 0;
         double jml = 0;
         while(i < shopCart.size()){
             System.out.println("ID Barang : " + shopCart.get(i).getBarang().getProductID());
             System.out.println("Nama Barang : " + shopCart.get(i).getBarang().getProductName());
             System.out.println("Harga satuan : $" + shopCart.get(i).getBarang().getPrice());
             System.out.println("Jumlah Barang : " + shopCart.get(i).getQty());
             System.out.println("Total : $" + shopCart.get(i).getTotal() + "\n");
             
             jml += shopCart.get(i).getTotal();
             i += 1;
         }
         
         System.out.println("Total yang harus dibayar : $"+jml);
    }//GEN-LAST:event_a_transaksiMouseClicked

    private void a_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_barangMouseClicked
        Frame_Barang fb = new Frame_Barang();
        konten.removeAll();
        konten.add(fb);
        fb.setVisible(true);
    }//GEN-LAST:event_a_barangMouseClicked

    private void a_lokasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_lokasiMouseClicked
        Frame_Lokasi fl = new Frame_Lokasi();
        konten.removeAll();
        konten.add(fl);
        fl.setVisible(true);
    }//GEN-LAST:event_a_lokasiMouseClicked

    private void a_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_pelangganMouseClicked
        Frame_Pelanggan fp = new Frame_Pelanggan();
        konten.removeAll();
        konten.add(fp);
        fp.setVisible(true);
    }//GEN-LAST:event_a_pelangganMouseClicked

    private void a_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_loginMouseClicked
        Login l = new Login();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_a_loginMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        if (this.end + 15 <= this.max) {

            this.start = this.end;
            this.end = this.end + 15 > this.max ? this.max : this.end + 15;

            Frame_Grid_Barang grid = new Frame_Grid_Barang(start, end);
            konten.removeAll();
            konten.add(grid);
            grid.setVisible(true);
            btnNext.setEnabled(this.end < this.max);
            btnPrev.setEnabled(true);
        } else {
            btnNext.setEnabled(false);
        }
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        if (this.start - 15 >= 0) {
            
            this.end = this.start;
            this.start = this.start - 15 < 0 ? 0 : this.start - 15;

            Frame_Grid_Barang grid = new Frame_Grid_Barang(start, end);
            konten.removeAll();
            konten.add(grid);
            grid.setVisible(true);
            btnNext.setEnabled(true);
            btnPrev.setEnabled(this.start > 0);
        } else {
            btnPrev.setEnabled(false);
        }
    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevActionPerformed

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
            java.util.logging.Logger.getLogger(Dash_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_barang;
    private javax.swing.JLabel a_login;
    private javax.swing.JLabel a_lokasi;
    private javax.swing.JLabel a_pelanggan;
    private javax.swing.JLabel a_transaksi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel konten;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
