package com.gestionproduit;

public class Customer {
    private String fullnam;
    private String adresse;

    public Customer(String fullnam, String adresse) {
        this.fullnam = fullnam;
        this.adresse = adresse;
    }

    public String getFullname() {
        return fullnam;
    }

    public String getAddress() {
        return adresse;
    }
}
