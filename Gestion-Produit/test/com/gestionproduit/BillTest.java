package com.gestionproduit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private String output;
    private Writer writerMock=new Writer() {
        @Override
        public void start() {
            output="";
        }

        @Override
        public void writeLine(String Line) {
        output+=Line+"\n";
        }

        @Override
        public void stop() {
        }
    };

    private Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    private Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Fridg fridge = new Fridg("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addproduct(cafe, 1);
        bill.addproduct(tv, 1);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addproduct(cafe, 1);
        bill.addproduct(tv, 1);
        bill.addproduct(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }

}