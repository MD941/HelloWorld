package org.example.model;


public class Kamion extends Vozilo {

    private Integer nosivost;
    private Boolean imaPrikolicu;

    public Kamion(String marka, String model, String registracija, Integer nosivost, Boolean imaPrikolicu) {
        super(marka, model, registracija);
        this.nosivost = nosivost;
        this.imaPrikolicu = imaPrikolicu;
    }


    public Integer getNosivost() {
        return nosivost;
    }

    public void setNosivost(Integer nosivost) {
        this.nosivost = nosivost;
    }

    public Boolean getImaPrikolicu() {
        return imaPrikolicu;
    }

    public void setImaPrikolicu(Boolean imaPrikolicu) {
        this.imaPrikolicu = imaPrikolicu;
    }

}
