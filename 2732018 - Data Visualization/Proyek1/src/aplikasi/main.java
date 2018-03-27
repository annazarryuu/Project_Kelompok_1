/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class main {
     public static void main(String[] args) {
         try {
             Thread.sleep(3000);
         } catch (InterruptedException ex) {
             Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
         }
       Transaksi a= new Transaksi();
       a.setVisible(true);
    }
}
