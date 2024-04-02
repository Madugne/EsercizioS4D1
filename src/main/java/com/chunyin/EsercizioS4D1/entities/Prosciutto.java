package com.chunyin.EsercizioS4D1.entities;

public class Prosciutto extends Topping{
    private final double price = 1.5;
    private final double nutritionalInfo = 2.0;

    public Prosciutto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName() + " + Prosciutto";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public double getNutritionalInfo() {
        return super.getNutritionalInfo() + nutritionalInfo;
    }

    @Override
    public String toString() {
        return "Ingrediente prosciutto [price=" + price + ", nutritionalInfo=" + nutritionalInfo + "]";
    }
}
