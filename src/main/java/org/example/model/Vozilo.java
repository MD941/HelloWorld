package org.example.model;

import org.example.NeispravniPodaciException;

public class Vozilo {

    private String registarskiBroj;
    private String marka;
    private Integer godinaProizvodnja;

    public Vozilo(String registarskiBroj, String marka, Integer godinaProizvodnja) {
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.godinaProizvodnja = godinaProizvodnja;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getGodinaProizvodnja() {
        return godinaProizvodnja;
    }

    public void setGodinaProizvodnja(Integer godinaProizvodnja) {
        this.godinaProizvodnja = godinaProizvodnja;
    }

    public void prikaziPodatke(){
        System.out.println(this.getMarka() + " " + this.getRegistarskiBroj() + " " + this.getGodinaProizvodnja());
    }
}
