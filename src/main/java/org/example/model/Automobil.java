package org.example.model;

public class Automobil extends Vozilo{

    private Integer brojSjedala;
    private String vrstaGoriva;

    public Automobil(String marka, String model, String registracija, Integer brojSjedala, String vrstaGoriva) {
        super(marka, model, registracija);
        this.brojSjedala = brojSjedala;
        this.vrstaGoriva = vrstaGoriva;
    }

    public Integer getBrojSjedala() {
        return brojSjedala;
    }

    public void setBrojSjedala(Integer brojSjedala) {
        this.brojSjedala = brojSjedala;
    }

    public String getVrstaGoriva() {
        return vrstaGoriva;
    }

    public void setVrstaGoriva(String vrstaGoriva) {
        this.vrstaGoriva = vrstaGoriva;
    }

    @Override
    public String vratiDetaljeVozila() {
        return super.vratiDetaljeVozila();
    }


}
