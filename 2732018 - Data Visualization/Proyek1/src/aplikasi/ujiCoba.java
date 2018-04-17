/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
package aplikasi;

import Model.ModelBarang;
import Model.ModelKategori;
import Model.ModelSubKategori;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gibran
 */
public class ujiCoba {
    public static void main(String[] args) throws IOException{
        /*
        ModelSubKategori sub = new ModelSubKategori();
        List<ModelSubKategori> subList;
        
        subList = sub.getList();
        
        if(!subList.isEmpty()){
            int size;
            
            size = subList.size();
            
            for(int i=0;i<size;i++){
                System.out.println(subList.get(i).getId_sub()+ " - " + subList.get(i).getKategori().getKategori() 
                        + " - " + subList.get(i).getSubKategori());
            }

        }
        */
        
        ModelBarang brg = new ModelBarang();
        List<ModelBarang> list;
        
        list = brg.getList();
        
        if(!list.isEmpty()){
            int size;
            
            size = list.size();
            
            for(int i=0;i<10;i++){
                System.out.println(list.get(i).getProductID() + " - " 
                        + list.get(i).getSubcategory().getSubKategori()
                        + " - " + list.get(i).getProductName());
            }

        }
    }
}
