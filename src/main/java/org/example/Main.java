package org.example;



public class Main {
    public static void main(String[] args) {

            Polaznik polaznik1 = new Polaznik("Ivo", "Ivić");
            System.out.println(polaznik1.getIme() + " " + polaznik1.getPrezime());

            Polaznik polaznik2 = new Polaznik("Petar", "Perić", 25, "M");
            polaznik2.setDob(30);

            Polaznik polaznik3 = new Polaznik();
            polaznik3.setIme("Marko");
            polaznik3.setPrezime("Markić");
        }
    }
