package com.chunyin.EsercizioS4D1.entities;

public class PizzaMargherita implements Pizza{
    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public double getNutritionalInfo() {
        return 0;
    }

    @Override
    public String toString() {
        return "MargheritaPizza [nome=" + getName() + ", prezzo=" + getPrice() + ", info nutrizionali="
                + getNutritionalInfo() + "]";
    }
}
