package org.example.model;

public class Clan extends Osoba {

    private String clanskiBroj;
    public Clan(String ime, String prezime, String clanskiBroj) {
        super(ime, prezime);
        this.clanskiBroj = clanskiBroj;
    }

    public String getClanskiBroj() {
        return clanskiBroj;
    }

    public void setClanskiBroj(String clanskiBroj) {
        this.clanskiBroj = clanskiBroj;
    }
}

