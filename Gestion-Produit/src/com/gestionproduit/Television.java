package com.gestionproduit;

public class Television extends Product {

    private int size;
    private String slabType;


    public Television(String nam, String descriptino, double price,int size,String slabType) {
        super(nam, descriptino, price);

        this.size=size;
        this.slabType=slabType;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
}
