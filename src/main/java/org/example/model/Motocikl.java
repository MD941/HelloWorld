package org.example.model;

import org.example.NeispravniPodaciException;

public class Motocikl extends Vozilo{

    private String tipMotora;

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public Motocikl(String registarskiBroj, String marka, Integer godinaProizvodnja, String tipMotora) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnja);
        if (godinaProizvodnja < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje ne može biti negativna");
        }
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println(" " + this.getTipMotora());
    }
}
