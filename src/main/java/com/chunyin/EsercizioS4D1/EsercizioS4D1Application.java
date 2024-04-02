package com.chunyin.EsercizioS4D1;

import com.chunyin.EsercizioS4D1.config.Config;
import com.chunyin.EsercizioS4D1.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class EsercizioS4D1Application {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioS4D1Application.class, args);
		menu();
	}

	public static void menu() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Pizza margherita = ctx.getBean("margherita", Pizza.class);
		Pizza hawaiian = ctx.getBean("hawaiian", Pizza.class);

		System.out.println("Pizza Margherita: " + margherita.getName() + ", Prezzo: " + margherita.getPrice()
				+ ", Info Nutrizionali: " + margherita.getNutritionalInfo());
		System.out.println("Pizza Hawaiian: " + hawaiian.getName() + ", Prezzo: " + hawaiian.getPrice()
				+ ", Info Nutrizionali: " + hawaiian.getNutritionalInfo());
		log.info(ctx.getBean("margherita").toString());
		log.info(ctx.getBean("prosciutto").toString());

	}

}
