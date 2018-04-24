/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author Annazar
 */
public class UjiCompare {
    public static void main(String[] Annazar) {
        String satu = "980404";
        String dua = "971204";
        
        if(Integer.parseInt(satu) < Integer.parseInt(dua)) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
    }
}
