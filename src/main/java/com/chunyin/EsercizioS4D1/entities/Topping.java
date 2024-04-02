package com.chunyin.EsercizioS4D1.entities;

public abstract class Topping implements Pizza{
    protected Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public double getNutritionalInfo() {
        return pizza.getNutritionalInfo();
    }
}
