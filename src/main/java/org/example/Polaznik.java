package org.example;

public class Polaznik {

    private String ime;
    private String prezime;
    private Integer dob;
    private String spol;

    //    polaznik koji ima samo ime i prezime
    public Polaznik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    //     polaznik ima sve vrijednosti propertia (varijabli)
    public Polaznik(String ime, String prezime, Integer dob, String spol) {
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.spol = spol;
    }

    //     polaznik nema niti jednu vrijednost varijabli
    public Polaznik() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Integer getDob() {
        return dob;
    }

    public String getSpol() {
        return spol;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }
}
