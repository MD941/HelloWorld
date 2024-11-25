package org.example.model;

public abstract class Vozilo {

    private String marka;
    private String model;
    private String registracija;


    public Vozilo(String marka, String model, String registracija) {
        this.marka = marka;
        this.model = model;
        this.registracija = registracija;
    }



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String vratiDetaljeVozila() {
        return this.marka + " " + this.model + " " + this.registracija;
    }

}
