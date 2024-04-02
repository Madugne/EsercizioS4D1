package com.chunyin.EsercizioS4D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Oggettistica {
    private String name;
    private double price;

    public Oggettistica() {
    }

    @Override
    public String toString() {
        return "Merchandise{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
