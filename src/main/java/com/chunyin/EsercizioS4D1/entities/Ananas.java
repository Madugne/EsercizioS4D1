package com.chunyin.EsercizioS4D1.entities;

public class Ananas extends Topping{
    private final double price = 1.0;
    private final double nutritionalInfo = 2.0;

    public Ananas(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName() + " + Ananas";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public double getNutritionalInfo() {
        return super.getNutritionalInfo() + nutritionalInfo;
    }
}
