package com.gestionproduit;

public class Product {
   private String nam;
   private String descriptino;
   private double price;

    /**
     * Display a full description of the product
     */
    public void look(){

    }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill,Integer quantity){

    }

    public String getNam() {
        return nam;
    }

    public String getDescriptino() {
        return descriptino;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
