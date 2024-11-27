package org.example.model;

import org.example.NeispravniPodaciException;

public class Automobil extends Vozilo {

    private Integer brojVrata;

    public Automobil(String registarskiBroj, String marka, Integer godinaProizvodnja, Integer brojVrata) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnja);
        if (godinaProizvodnja < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje ne može biti negativna");
        }
        this.brojVrata = brojVrata;
    }

    public Integer getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(Integer brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println(" " + this.getBrojVrata());
    }
}
