/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gibran
 */
public class ModelDonation {

    /**
     * @return the donationID
     */
    public String getDonationID() {
        return donationID;
    }

    /**
     * @param donationID the donationID to set
     */
    public void setDonationID(String donationID) {
        this.donationID = donationID;
    }

    /**
     * @return the jmlDonasi
     */
    public double getJmlDonasi() {
        return jmlDonasi;
    }

    /**
     * @param jmlDonasi the jmlDonasi to set
     */
    public void setJmlDonasi(double jmlDonasi) {
        this.jmlDonasi = jmlDonasi;
    }
    private String donationID;
    private double jmlDonasi;
}
