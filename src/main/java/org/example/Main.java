package org.example;


import org.example.model.Automobil;
import org.example.model.Kamion;
import org.example.model.Vozilo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vozilo> vozila = new ArrayList<>();
        Kamion kamion1 = new Kamion("Mercedes", "A54", "KR234DT", 34322, true);
        Kamion kamion2 = new Kamion("Scania", "A34", "KR224DT", 34233, true);
        Automobil automobil1 = new Automobil("Seat", "Leon", "ZG4324RT", 5, "Dizel");
        Automobil automobil2 = new Automobil("Toyota", "Yaris", "ZG4321RT", 5, "Benzin");
        vozila.add(kamion1);
        vozila.add(kamion2);
        vozila.add(automobil1);
        vozila.add(automobil2);

        System.out.println(pronadiVoziloPoRegistraciji("KR234DT", vozila));
        ispisiSvaVozilaUVoznomParku(vozila);

    }

    public static String pronadiVoziloPoRegistraciji(String registracija, List<Vozilo> vozila) {
        for (int i = 0; i < vozila.size(); i++) {
            if (vozila.get(i).getRegistracija().equals(registracija)) {
                Vozilo vozilo = vozila.get(i);
                return vozilo.vratiDetaljeVozila();
            }
        }
        return "Vozilo ne postoji u sustavu";
    }

    public static void ispisiSvaVozilaUVoznomParku(List<Vozilo> vozila) {
        for (int i = 0; i < vozila.size(); i++) {
            System.out.println(vozila.get(i).vratiDetaljeVozila());
        }
    }
}


