package com.gestionproduit;

public class ExpresDelivery implements Delivery {

    private String city;

    public ExpresDelivery(String city) {
        this.city=city;
    }

    @Override
    public double getPrice() {
        if (city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }

    @Override
    public String getInfo() {
        return "livreson a domecile express"+ getPrice();
    }
}
