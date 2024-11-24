package org.example;


import org.example.model.Clan;
import org.example.model.Knjiga;
import org.example.model.Knjiznica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Clan> clanovi = new ArrayList<>();
        List<Knjiga> knjigeUKnjiznici = new ArrayList<>();
        List<Knjiga> posudeneKnjige = new ArrayList<>();

        Knjiznica knjiznica = new Knjiznica(clanovi, knjigeUKnjiznici, posudeneKnjige);
        Knjiga harryPotterKnjiga = new Knjiga("Harry Potter", "J. K. Rowling");
        Knjiga hobbitKnjiga = new Knjiga("Hobit", "J.R.R. Tolkien");

        knjiznica.dodajKnjiguUKnjiznicu(harryPotterKnjiga);
        knjiznica.dodajKnjiguUKnjiznicu(hobbitKnjiga);

        System.out.println("Trenutno stanje dostupnih knjiga u knjižnici je sljedeće: ");
        knjiznica.ispiseSveKnjigeUKnjiznici(knjigeUKnjiznici);

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");

        System.out.println("Unesite podatke osobe: (ime, prezime, članski broj)");
        System.out.println("Ime:");
        String ime = scanner.nextLine();

        System.out.println("Prezime:");
        String prezime = scanner.nextLine();

        System.out.println("Clanski broj:");
        String clanskiBroj = scanner.nextLine();

        Clan clan = new Clan(ime, prezime, clanskiBroj);
        knjiznica.dodajClana(clan);

        knjiznica.dodajKnjiguUPosudene(harryPotterKnjiga, clan.getClanskiBroj());
        System.out.println("Trenutno stanje dostupnih knjiga u knjižnici je sljedeće: ");
        knjiznica.ispiseSveKnjigeUKnjiznici(knjigeUKnjiznici);
        System.out.println("--------------------------------------------------------");

        System.out.println("Trenutno stanje pusuđenih knjiga je sljedeće: ");
        knjiznica.ispiseSvePosudeneKnjige(posudeneKnjige);
        System.out.println("--------------------------------------------------------");

        knjiznica.dodajKnjiguUKnjiznicu(harryPotterKnjiga);
        System.out.println("Trenutno stanje dostupnih knjiga u knjižnici je sljedeće: ");
        knjiznica.ispiseSveKnjigeUKnjiznici(knjigeUKnjiznici);
        System.out.println("--------------------------------------------------------");


        knjiznica.ispiseSveKnjigeUDatoteku(knjigeUKnjiznici);
        knjiznica.ispiseClanoveUDatoteku(clanovi);

    }


}



