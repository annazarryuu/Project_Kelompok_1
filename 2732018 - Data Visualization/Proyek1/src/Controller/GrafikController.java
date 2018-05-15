/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ACER Z3-451
 */
public class GrafikController {

    BarangController bc = new BarangController();

    public JPanel displayPieChart() {
        DefaultPieDataset objDataset = new DefaultPieDataset();
        ChartPanel chartPanel = new ChartPanel(createPieChart(objDataset));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        return chartPanel;
    }

    JFreeChart createPieChart(DefaultPieDataset objDataset) {
        objDataset = createPieDataset(objDataset);

        JFreeChart chart = ChartFactory.createPieChart("Pie Chart for Sub-Category", objDataset);
        CategoryPlot plot = chart.getCategoryPlot();
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);

        return chart;
    }

    DefaultPieDataset createPieDataset(DefaultPieDataset objDataset) {
        int size;
        int i = 0;
        int bo = 0, ch = 0, fu = 0, ta = 0;
        int ap = 0, ar = 0, bi = 0, en = 0, fa = 0, la = 0;
        int pa = 0, st = 0, su = 0, ac = 0, co = 0, ma = 0, ph = 0;

        try {
            size = bc.getList().size();

            while (i < size) {
                String idSub = bc.getList().get(i).getSubcategory().getId_sub();
                objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), bo++);
                switch (idSub) {
                    case "BO":
//                        System.out.println("case");
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), bo++);
                        break;
                    case "CH":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ch++);
                        break;
                    case "FU":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), fu++);;
                        break;
                    case "TA":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ta++);;
                        break;
                    case "AP":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ap++);;
                        break;
                    case "AR":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ar++);;
                        break;
                    case "BI":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), bi++);;
                        break;
                    case "EN":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), en++);;
                        break;
                    case "FA":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), fa++);;
                        break;
                    case "LA":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), la++);;
                        break;
                    case "PA":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), pa++);;
                        break;
                    case "ST":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), st++);;
                        break;
                    case "SU":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), su++);;
                        break;
                    case "AC":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ac++);;
                        break;
                    case "CO":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), co++);;
                        break;
                    case "MA":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ma++);;
                        break;
                    case "PH":
                        objDataset.setValue(bc.getList().get(i).getSubcategory().getSubKategori(), ph++);;
                        break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GrafikController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objDataset;
    }
}
