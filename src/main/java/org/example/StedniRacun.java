package org.example;

import java.math.BigDecimal;

public class StedniRacun extends Racun {

    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik){
        super(brojRacuna, stanje, vlasnik);

    }
    @Override
    public BigDecimal obracunajKamatu(BigDecimal bigDecimal) {
        return super.obracunajKamatu(BigDecimal.valueOf(1.5));
    }
    @Override
    public BigDecimal isplata(BigDecimal iznos) {
        return super.isplata(iznos);
    }

    @Override
    public BigDecimal uplata(BigDecimal iznos) {
        return super.uplata(iznos);
    }

}
