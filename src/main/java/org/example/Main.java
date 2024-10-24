package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite zeljenu velicinu liste: ");
        Scanner scanner = new Scanner(System.in);
        int velicinaListe = scanner.nextInt();
        List<Integer> listaBrojeva = new ArrayList<>(velicinaListe);
        System.out.println("Unesite listu sljedece velicine: " + velicinaListe);
        for (int i = 0; i < velicinaListe; i++) {
            listaBrojeva.add(scanner.nextInt());
        }
        izracunaj(listaBrojeva);
        System.out.println(izracunaj(listaBrojeva) ? "Lista je uzlazno sortirana" : "Lista nije uzlazno sortirana");
    }

    public static Boolean izracunaj(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}