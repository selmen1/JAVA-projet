package com.gestionproduit;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> product;
    private Delivery delivery;

    public Bill(Customer customer,Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public  void addproduct(Product product,Integer quantity){
        this.product.put(product,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProduct() {
        return product;
    }
}
