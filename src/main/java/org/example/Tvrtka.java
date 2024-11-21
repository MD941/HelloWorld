package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tvrtka {

    private String ime;
    private List<Zaposlenik> zaposlenici;

    public Tvrtka(String ime, List<Zaposlenik> zaposlenici) {
        this.ime = ime;
        this.zaposlenici = zaposlenici;
    }
  public Tvrtka(String ime) {
        this.ime = ime;
        this.zaposlenici = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Zaposlenik> getZaposlenici() {
        return zaposlenici;
    }

    public void setZaposlenici(List<Zaposlenik> zaposlenici) {
        this.zaposlenici = zaposlenici;
    }

    public void dodajZaposlenika(Zaposlenik zaposlenik) {
        this.zaposlenici.add(zaposlenik);
    }

    public void ispisiZaposlenike() {
        for (int i = 0; i < zaposlenici.size(); i++) {
            System.out.println(
                    zaposlenici.get(i).getIme() + " " +
                    zaposlenici.get(i).getPrezime() + " " +
                    zaposlenici.get(i).getPlaca());
        }
    }

    public Zaposlenik pronadjiNajvecuPlacu(){
        Zaposlenik zaposlenikSNajvecomPlacom = zaposlenici.get(0);

        for (int i = 0; i < zaposlenici.size(); i++) {
            if(zaposlenici.get(i).getPlaca() > zaposlenikSNajvecomPlacom.getPlaca()){
                zaposlenikSNajvecomPlacom = zaposlenici.get(i);
            }
        }
        System.out.println("Zaposlenik s najvecom placom je: " + zaposlenikSNajvecomPlacom.getIme() + " " + zaposlenikSNajvecomPlacom.getPrezime() + " " + "s placom od " + zaposlenikSNajvecomPlacom.getPlaca());
        return zaposlenikSNajvecomPlacom;
    }
}
