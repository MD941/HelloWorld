package org.example;

import java.math.BigDecimal;

public class TekuciRacun extends Racun {
    public TekuciRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik, BigDecimal.valueOf(0.1));
    }


    @Override
    public BigDecimal obracunajKamatu(BigDecimal bigDecimal) {
        return super.obracunajKamatu();
    }

    @Override
    public BigDecimal uplata(BigDecimal iznos) {
        BigDecimal iznosPoslijeUplate = super.uplata(iznos);
         BigDecimal iznosKamate = super.obracunajKamatu(BigDecimal.valueOf(0,1));
        return iznosPoslijeUplate.subtract(iznosKamate);


    }

    @Override
    public BigDecimal isplata(BigDecimal iznos) {
        BigDecimal iznosPoslijeIsplate = super.isplata(iznos);
        BigDecimal iznosKamate = super.obracunajKamatu(BigDecimal.valueOf(0,1));
        return iznosPoslijeIsplate.subtract(iznosKamate);

    }
}
