package com.chunyin.EsercizioS4D1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@Setter
@Component
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<OrdineMenu> elementiMenu;
    @Value("${application.costo.coperto}")
    private int costoCoperto;
    private Tavolo tavolo;

    public Ordine() {
        this.elementiMenu = new ArrayList<>();
    }

    public double getImportoTotale() {
        int numeroCoperti = getNumeroCoperti();
        int costoCoperto = getCostoCoperto();
        double importoTotale = numeroCoperti * costoCoperto;

        for (OrdineMenu elemento : elementiMenu) {
            importoTotale += elemento.getPrezzo();
        }

        return importoTotale;
    }

}
