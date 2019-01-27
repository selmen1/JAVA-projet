package com.gestionproduit;

public class Fridg extends Product {

    private int liter;
    private boolean freeser;

    public Fridg(String nam, String descriptino, double price,int liter, boolean freeser) {
        super(nam, descriptino, price);
        this.liter = liter;
        this.freeser = freeser;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreeser(){
        return freeser;
    }
}
