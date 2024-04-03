package com.chunyin.EsercizioS4D1;

import com.chunyin.EsercizioS4D1.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OrderRunner implements CommandLineRunner {
    @Autowired
    private Ordine nuovoOrdine;
    private final Pizza margherita;
    private final Pizza hawaiian;
    private final Bevande wine;

    public OrderRunner(Pizza margherita, Pizza hawaiian, Bevande wine) {
        this.margherita = margherita;
        this.hawaiian = hawaiian;
        this.wine = wine;
    }

    @Override
    public void run(String... args) throws Exception {

        OrdineMenu pizzaMargherita = new OrdineMenu("Margherita", margherita.getPrice(), "Senza pomodoro");
        OrdineMenu pizzaHawaiian = new OrdineMenu("Hawaiian", hawaiian.getPrice(), "Extra ananas");
        OrdineMenu bevandaOrdinata = new OrdineMenu(wine.getName(), wine.getPrice(), "Con ghiaccio");
        Tavolo tavolo = new Tavolo(2, 10, StatoTavolo.LIBERO);
        nuovoOrdine.setNumeroOrdine(1);
        nuovoOrdine.setStato(StatoOrdine.IN_CORSO);
        nuovoOrdine.setNumeroCoperti(4);
        nuovoOrdine.setOraAcquisizione(LocalDateTime.now());
        nuovoOrdine.setTavolo(tavolo);
        nuovoOrdine.getElementiMenu().add(pizzaMargherita);
        nuovoOrdine.getElementiMenu().add(pizzaHawaiian);
        nuovoOrdine.getElementiMenu().add(bevandaOrdinata);
        nuovoOrdine.setTavolo(tavolo);

        System.out.println("Ordine:");
        System.out.println("Numero Ordine: " + nuovoOrdine.getNumeroOrdine());
        System.out.println("Numero Tavolo: " + tavolo.getNumero());
        System.out.println("Stato tavolo: " + tavolo.getStato());
        System.out.println("Stato: " + nuovoOrdine.getStato());
        System.out.println("Numero Coperti: " + nuovoOrdine.getNumeroCoperti());
        System.out.println("Ora di Acquisizione: " + nuovoOrdine.getOraAcquisizione());
        System.out.println("Costo Coperto: " + nuovoOrdine.getCostoCoperto());
        System.out.println("Elementi Menu Ordinati: ");
        for (OrdineMenu elemento : nuovoOrdine.getElementiMenu()) {
            System.out.println(
                    "- " + elemento.getNome() + ", Prezzo: " + elemento.getPrezzo() + ", Nota: " + elemento.getNote());
        }
        System.out.println("Importo Totale: " + nuovoOrdine.getImportoTotale());
    }
}
