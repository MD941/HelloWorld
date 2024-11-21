package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NameOrSurnameException, PaycheckException {

        System.out.println("Unesite podatke za 3 zaposlenika: (Ime, prezime i plaća)");

        Scanner scanner;
        Tvrtka tvrtka = new Tvrtka("Salvus");
        String ime = "";
        String prezime = "";
        double placa;
        for (int i = 0; i < 3; i++) {
            scanner = new Scanner(System.in);
            System.out.print("Ime: ");
            ime = scanner.nextLine();
            if (ime == null || ime.isEmpty()) {
                throw new NameOrSurnameException("Ime ne može biti prazno");
            }

            System.out.print("Prezime: ");
            prezime = scanner.nextLine();
            if (prezime == null || prezime.isEmpty()) {
                throw new NameOrSurnameException("Prezime ne može biti prazno");
            }
            System.out.print("Plaća: ");
            placa = scanner.nextDouble();
            if (placa == 0 || placa < 0) {
                throw new PaycheckException("Place ne moze biti 0 ili manje od 0");
            }
            Zaposlenik zaposlenik = new Zaposlenik(ime, prezime, placa);
            tvrtka.dodajZaposlenika(zaposlenik);
        }

        tvrtka.ispisiZaposlenike();
        tvrtka.pronadjiNajvecuPlacu();

    }
}



