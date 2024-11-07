package org.example;

import java.math.BigDecimal;

public abstract class Racun {

    private String brojRacuna;
    private BigDecimal stanje;
    private String vlasnik;

    private BigDecimal kamatnaStopa;

    private BigDecimal iznos;

    public Racun(String brojRacuna, BigDecimal stanje, String vlasnik, BigDecimal kamatnaStopa) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
        this.kamatnaStopa = kamatnaStopa;
    }


    public BigDecimal obracunajKamatu() {
        return stanje.multiply(kamatnaStopa);
    }


    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public BigDecimal getStanje() {
        return this.stanje;
    }

    public String getVlasnik() {
        return this.vlasnik;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setStanje(BigDecimal stanje) {
        this.stanje = stanje;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }
    public BigDecimal uplata(BigDecimal iznos) {
        BigDecimal stanjePoslijeUplate =  stanje.add(iznos);
        setStanje(stanjePoslijeUplate);
        return stanjePoslijeUplate;
    }

    public BigDecimal isplata(BigDecimal iznos) {
        BigDecimal stanjePoslijeIsplate =  stanje.subtract(iznos);
        setStanje(stanjePoslijeIsplate);
        return stanjePoslijeIsplate;
    }


}
