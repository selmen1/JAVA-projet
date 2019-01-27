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

    public Product(String nam, String descriptino, double price) {
        this.nam = nam;
        this.descriptino = descriptino;
        this.price = price;
    }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill,Integer quantity){

    }

    public String getName() {
        return nam;
    }

    public String getDescription() {
        return descriptino;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
