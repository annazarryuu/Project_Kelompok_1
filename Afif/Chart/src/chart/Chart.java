/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author ACER Z3-451
 */
public class Chart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChartDisplay frame = new ChartDisplay ();
//        frame.setVisible(true);
        
//        ReadExcel r = new ReadExcel ();
//        System.out.println(r.getRowsNow());
//        System.out.println(r.getSum());
        frame.pack();
        RefineryUtilities.centerFrameOnScreen( frame );
        frame.setVisible( true );
    }
    
}
