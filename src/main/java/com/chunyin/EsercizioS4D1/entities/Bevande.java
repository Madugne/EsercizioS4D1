package com.chunyin.EsercizioS4D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Bevande {
    private String name;
    private double price;
    private double nutritionalInfo;

    public Bevande() {
    }

    @Override
    public String toString() {
        return "Drink{" + "calories=" + nutritionalInfo + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
