package org.example;

public class Student {

    private String ime;
    private String prezime;
    private String brIndexa;

    public Student(String ime, String prezime, String brIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brIndexa = brIndexa;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public String getBrIndexa() {
        return this.brIndexa;
    }
}
