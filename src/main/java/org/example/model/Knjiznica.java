package org.example.model;

import org.example.servis.ClanServis;
import org.example.servis.KnjiznicaServis;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Knjiznica implements KnjiznicaServis, ClanServis {

    private List<Clan> clanovi;
    private List<Knjiga> knjigeUKnjiznici;
    private List<Knjiga> posudeneKnjige;

    public Knjiznica(List<Clan> clanovi, List<Knjiga> knjigeUKnjiznici, List<Knjiga> posudeneKnjige) {
        this.clanovi = clanovi;
        this.knjigeUKnjiznici = knjigeUKnjiznici;
        this.posudeneKnjige = posudeneKnjige;
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public List<Knjiga> getKnjigeUKnjiznici() {
        return knjigeUKnjiznici;
    }

    public void setKnjigeUKnjiznici(List<Knjiga> knjigeUKnjiznici) {
        this.knjigeUKnjiznici = knjigeUKnjiznici;
    }

    public List<Knjiga> getPosudeneKnjige() {
        return posudeneKnjige;
    }

    public void setPosudeneKnjige(List<Knjiga> posudeneKnjige) {
        this.posudeneKnjige = posudeneKnjige;
    }


    @Override
    public void dodajClana(Clan clan) {
        this.clanovi.add(clan);
    }

    @Override
    public void dodajKnjiguUKnjiznicu(Knjiga knjiga) {
        for (int i = 0; i < posudeneKnjige.size(); i++) {
            if (posudeneKnjige.get(i).getAutor().equals(knjiga.getAutor()) && posudeneKnjige.get(i).getNaslov().equals(knjiga.getNaslov())) {
                posudeneKnjige.remove(posudeneKnjige.get(i));
            }
        }
        this.knjigeUKnjiznici.add(knjiga);
    }

    @Override
    public void dodajKnjiguUPosudene(Knjiga knjiga, String clanskiBroj) {
        knjigeUKnjiznici.remove(knjiga);
        Knjiga posudenaKnjiga = new Knjiga(knjiga.getNaslov(), knjiga.getAutor(), clanskiBroj);
        posudeneKnjige.add(posudenaKnjiga);
    }

    public void ispiseSveKnjigeUKnjiznici(List<Knjiga> knjige) {
        for (int i = 0; i < knjige.size(); i++) {
            System.out.println(i + 1 + "." + " " + knjige.get(i).getNaslov() + " " + knjige.get(i).getAutor());
        }
    }

    public void ispiseSveKnjigeUDatoteku(List<Knjiga> knjige) {
        try (PrintWriter out = new PrintWriter("tvrtka.txt")) {
            for (int i = 0; i < knjige.size(); i++) {
                out.println(knjige.get(i).getAutor() + ", " + knjige.get(i).getNaslov());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ispiseClanoveUDatoteku(List<Clan> clanovi) {
        try (PrintWriter out = new PrintWriter("clanovi.txt")) {
            for (int i = 0; i < clanovi.size(); i++) {
                out.println(clanovi.get(i).getIme() + ", " + clanovi.get(i).getPrezime() + " " + clanovi.get(i).getClanskiBroj());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ispiseSvePosudeneKnjige(List<Knjiga> posudeneKnjige) {
        for (int i = 0; i < posudeneKnjige.size(); i++) {
            System.out.println(i + 1 + "." + " " + posudeneKnjige.get(i).getNaslov() + " " + posudeneKnjige.get(i).getAutor() + " - " + "članski broj člana" + " " + posudeneKnjige.get(i).getClanskiBroj());
        }
    }

}
