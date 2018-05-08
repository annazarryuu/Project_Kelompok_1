/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

/**
 *
 * @author ACER Z3-451
 */
public class Model {
    private String category;
    private String lineItem;
    private int value;

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the lineItem
     */
    public String getLineItem() {
        return lineItem;
    }

    /**
     * @param lineItem the lineItem to set
     */
    public void setLineItem(String lineItem) {
        this.lineItem = lineItem;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}
