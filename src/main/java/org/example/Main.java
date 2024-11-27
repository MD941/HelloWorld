package org.example;


import org.example.model.Automobil;
import org.example.model.EvidencijaVozila;
import org.example.model.Motocikl;
import org.example.model.Vozilo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        Automobil automobil1 = new Automobil("KR123DT", "Audi", 1920, 5);
        Automobil automobil2 = new Automobil("ZG123DT", "BMW", 1940, 5);
        Automobil automobil3 = new Automobil("VU123DT", "Range Rover", 1960, 5);


        Motocikl motocikl = new Motocikl("KR122DT", "Ducati", 2020, "1000cc");
        Motocikl motocikl2 = new Motocikl("ZG122DT", "BMW", 2024, "1000cc");
        Motocikl motocikl3 = new Motocikl("VU122DT", "Suzuki", 1980, "1000cc");

        motocikl2.prikaziPodatke();

        List<Vozilo> listaVozila = new ArrayList<>();
        listaVozila.add(automobil1);
        listaVozila.add(automobil2);
        listaVozila.add(automobil3);
        listaVozila.add(motocikl);
        listaVozila.add(motocikl2);
        listaVozila.add(motocikl3);
        EvidencijaVozila evidencijaVozila = new EvidencijaVozila(listaVozila);

        evidencijaVozila.spremiPodatkeUDatoteku(listaVozila);
        evidencijaVozila.ucitajPodatkeIzDatoteke(new File("vozila.txt"));

    }
}
