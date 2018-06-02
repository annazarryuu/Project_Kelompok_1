/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import Controller.ShipController;
import Model.ModelKeranjang;
import Model.ModelShipMode;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Frame_Keranjang extends javax.swing.JInternalFrame {

    List<ModelKeranjang> keranjang;
    ShipController ship = new ShipController();
    List<ModelShipMode> list;
    String user; 

    /**
     * Creates new form Frame_Keranjang
     */
    public Frame_Keranjang() {
        initComponents();
    }

    public Frame_Keranjang(List<ModelKeranjang> shopCart, int start, int end, String username) {
        initComponents();
        this.keranjang = shopCart;
        this.user = username;
        this.showGrid(shopCart, start, end);
        this.showShipmode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelQty = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelSubTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxShipping = new javax.swing.JComboBox<>();
        jButtonProses = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelShipping = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1220, 717));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Your Cart");

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jumlah Item : ");

        jLabelQty.setText("Jmlh");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ringkasan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Sub Total");

        jLabelSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSubTotal.setText("Rp. 1.000.000");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("( XX Iitem )");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Shipping Method");

        jComboBoxShipping.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxShipping.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxShippingItemStateChanged(evt);
            }
        });

        jButtonProses.setText("Proceed To Transaction");
        jButtonProses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProsesMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Biaya Shipping");

        jLabelShipping.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelShipping.setText("Rp. 1.000.000");

        jLabel10.setText("_____________________________________");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TOTAL");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotal.setText("Rp. 1.000.000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonProses, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSubTotal)
                                        .addComponent(jComboBoxShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelShipping))))
                            .addComponent(jLabel10))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxShipping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProses, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelQty))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showShipmode() {
        try {
            list = ship.getList();
            int i = 0;

            this.jComboBoxShipping.removeAllItems();

            while (i < list.size()) {
                this.jComboBoxShipping.addItem(list.get(i).getShipMode());
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame_Keranjang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid(List<ModelKeranjang> shopCart, int start, int end) {
        int i = start - 1;
        double jml = 0;
        int inCart = 0;

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        jPanel2.setLayout(new GridLayout(5, 1));

        while (i < shopCart.size() && i < end) {
            Grid_Keranjang grid = new Grid_Keranjang();

            jml += shopCart.get(i).getTotal();
            inCart += shopCart.get(i).getQty();
            grid.getLabelHarga().setText("$" + shopCart.get(i).getBarang().getPrice());
            grid.getLabelKategori().setText(shopCart.get(i).getBarang().getSubcategory().getKategori().getKategori());
            grid.getLabelNama().setText(shopCart.get(i).getBarang().getProductName());
            grid.getLabelSubKategori().setText(shopCart.get(i).getBarang().getSubcategory().getSubKategori());
            grid.getLabelTotal().setText("$" + shopCart.get(i).getTotal());
            String qty = String.valueOf(shopCart.get(i).getQty());
            grid.getFieldQty().setText(qty);
            grid.setEdit(false);
            grid.getFieldQty().enable(false);

            ImageIcon icon = new ImageIcon(shopCart.get(i).getBarang().getSubcategory().getImageSource());
            grid.getLabelImage().setIcon(icon);

            grid.getButtonEdit().addActionListener(new EditListener(this, grid, shopCart, i));
            grid.getButtonDelete().addActionListener(new DeleteListener(this, shopCart, i));

            jPanel2.add(grid);
            i++;
        }

        jLabelQty.setText(String.valueOf(inCart));
        jLabelSubTotal.setText("$" + String.valueOf(jml));
        jLabelTotal.setText("$" + String.valueOf(jml));
    }

    private static class EditListener implements ActionListener {

        Frame_Keranjang frame;
        Grid_Keranjang panel;
        List<ModelKeranjang> cart;
        ModelKeranjang keranjang;
        int qty = 0;

        public EditListener(Frame_Keranjang frame, Grid_Keranjang panel, List<ModelKeranjang> shopCart, int i) {
            this.frame = frame;
            this.panel = panel;
            this.keranjang = shopCart.get(i);
            this.cart = shopCart;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (panel.isEdit()) {
                panel.setEdit(false);
                panel.getButtonEdit().setText("Edit Qty");
                panel.getFieldQty().enable(false);
                qty = Integer.parseInt(panel.getFieldQty().getText());
                keranjang.setQty(qty);
                keranjang.setTotal(qty * (keranjang.getBarang().getPrice()));
                int select = frame.jComboBoxShipping.getSelectedIndex();
                frame.jPanel2.removeAll();
                frame.showGrid(cart, 1, 5);
                frame.setVisible(false);
                frame.setVisible(true);

                double subtotal = Double.parseDouble(frame.jLabelSubTotal.getText().substring(1));
                double shipping = Double.parseDouble(frame.jLabelShipping.getText().substring(1));
                double total = subtotal + shipping;

                frame.jLabelTotal.setText("$" + total);

            } else {
                panel.getButtonEdit().setText("Selesai Edit");
                panel.setEdit(true);
                panel.getFieldQty().enable(true);
            }
        }
    }

    private static class DeleteListener implements ActionListener {

        Frame_Keranjang frame;
        List<ModelKeranjang> keranjang;
        int id;

        public DeleteListener(Frame_Keranjang frame, List<ModelKeranjang> shopCart, int i) {
            this.frame = frame;
            this.keranjang = shopCart;
            this.id = i;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int valid = JOptionPane.showConfirmDialog(frame, "Yakin ingin menghapus ? ");
            if (JOptionPane.YES_OPTION == valid) {
                keranjang.remove(id);
                frame.jPanel2.removeAll();
                frame.showGrid(keranjang, 1, 5);
                frame.setVisible(false);
                frame.setVisible(true);

                double subtotal = Double.parseDouble(frame.jLabelSubTotal.getText().substring(1));
                if (subtotal > 0) {
                    double shipping = Double.parseDouble(frame.jLabelShipping.getText().substring(1));
                    double total = subtotal + shipping;
                    frame.jLabelTotal.setText("$" + total);
                }

            } else {
                JOptionPane.showMessageDialog(frame, "Gak Jadi");
            }

        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxShippingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxShippingItemStateChanged
        if (jComboBoxShipping.getSelectedIndex() >= 0) {
            int id = jComboBoxShipping.getSelectedIndex();
            double subtotal = Double.parseDouble(this.jLabelSubTotal.getText().substring(1));
            double shipping = list.get(id).getPrice();
            double total = subtotal + shipping;

            this.jLabelShipping.setText("$" + shipping);
            this.jLabelTotal.setText("$" + total);
        }
    }//GEN-LAST:event_jComboBoxShippingItemStateChanged

    private void jButtonProsesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProsesMouseClicked
        Dash_User x = new Dash_User();
        System.out.println(this.user);
    }//GEN-LAST:event_jButtonProsesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonProses;
    private javax.swing.JComboBox<String> jComboBoxShipping;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelQty;
    private javax.swing.JLabel jLabelShipping;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
