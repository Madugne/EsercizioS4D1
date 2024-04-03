package com.chunyin.EsercizioS4D1.config;

import com.chunyin.EsercizioS4D1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("margherita")
    Pizza pizzaMargherita() {
        return new PizzaMargherita();
    }

    @Bean("prosciutto")
    Pizza prosciutto() {
        return new Prosciutto(pizzaMargherita());
    }

    @Bean
    Pizza ananas() {
        return new Ananas(prosciutto());
    }

    @Bean("hawaiian")
    Pizza hawaiianPizza() {
        return new Ananas(new Prosciutto(new PizzaMargherita()));
    }

    @Bean("soda")
    Bevande wine() {
        return new Bevande("Soda", 3, 3);
    }
}
