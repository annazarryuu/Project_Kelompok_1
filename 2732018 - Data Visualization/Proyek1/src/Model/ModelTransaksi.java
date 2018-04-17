/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Gibran
 */
public class ModelTransaksi {
    String orderID;
    Date orderDate;
    Date shipDate;
    ModelShipMode shipMode;
    ModelPelanggan pelanggan;
    ModelDaerah postal;
    ModelBarang product;
    double sales;
    int quantity;
    double discount;
    double profit;
    ModelDonation donation;
    double total;
}
