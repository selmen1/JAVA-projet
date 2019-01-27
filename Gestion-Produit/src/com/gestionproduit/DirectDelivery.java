package com.gestionproduit;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "livreson a domecile 4.99";
    }
}
