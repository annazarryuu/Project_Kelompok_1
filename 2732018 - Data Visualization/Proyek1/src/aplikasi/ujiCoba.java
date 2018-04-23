/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
package aplikasi;

import Controller.*;
import Model.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gibran
 */
public class ujiCoba {
    public static void main(String[] args) throws IOException{
        
        TransaksiController sub = new TransaksiController();
        List<ModelTransaksi> subList;
        
        subList = sub.getList();
        
        if(!subList.isEmpty()){
            int size;
            
            size = subList.size();
            
            for(int i=0;i<size;i++){
                System.out.println(subList.get(i).getOrderID()+ " - " + subList.get(i).getOrderDate()
                    + " - " + subList.get(i).getProduct().getProductName());
            }

        }
        
        /*
        ModelDaerah mdl = new ModelDaerah();
        List<ModelDaerah> list;
        
        list = mdl.getList();
        
        if(!list.isEmpty()){
            int size;
            
            size = list.size();
            
            for(int i=0;i<size;i++){
                System.out.println(list.get(i).getPostalCode() + " - " 
                        + list.get(i).getRegion() + " - " 
                        + list.get(i).getCountry() + " - " + list.get(i).getCity() 
                        + " - " + list.get(i).getState());
            }

        }
        */
    }
}
