package com.chunyin.EsercizioS4D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numero;
    private int copertiMassimi;
    private StatoTavolo stato;
}
