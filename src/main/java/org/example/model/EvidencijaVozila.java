package org.example.model;

import java.io.*;
import java.util.List;

public class EvidencijaVozila {

    private List<Vozilo> vozila;

    public EvidencijaVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }

    public EvidencijaVozila() {
    }

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void setVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }

    public void dodajVozilo(Vozilo vozilo) {
        this.vozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku(List<Vozilo> vozila) throws Exception {
        File file = new File("vozila.txt");
        try (FileWriter out = new FileWriter(file);) {
            for (int i = 0; i < vozila.size(); i++) {
                out.write(vozila.get(i).getMarka() + " " + vozila.get(i).getGodinaProizvodnja() + " " + vozila.get(i).getRegistarskiBroj() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ucitajPodatkeIzDatoteke(File file) throws Exception {
        try (FileReader in = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(in);
            int c = 0;
            String s = "";
            for (int i = 0; i < file.length(); i++) {
                c = bufferedReader.read();
                s = Character.toString(c);
                if(c == -1){
                    break;
                }
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
