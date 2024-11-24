package org.example.model;

public class Knjiga {

    private String naslov;
    private String autor;
    private String clanskiBroj;

    public Knjiga(String naslov, String autor, String clanskiBroj) {
        this.naslov = naslov;
        this.autor = autor;
        this.clanskiBroj = clanskiBroj;
    }
    public Knjiga(String naslov, String autor) {
        this.naslov = naslov;
        this.autor = autor;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getClanskiBroj() {
        return clanskiBroj;
    }

    public void setClanskiBroj(String clanskiBroj) {
        this.clanskiBroj = clanskiBroj;
    }
}
