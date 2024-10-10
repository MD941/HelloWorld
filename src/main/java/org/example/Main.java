package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tajniBroj = 5;
        Scanner scanner = new Scanner(System.in);
        int korisnikovInput;
        do {
            System.out.println("Pogodite tajni broj između 1 do 10");
            korisnikovInput = scanner.nextInt();

            if (tajniBroj == korisnikovInput) {
                System.out.println("Pogodili ste tajni broj!");
            } else {
                System.out.println("Nažalost nije točno, pokušajte ponovo!");
            }
        } while (tajniBroj != korisnikovInput);
    }
}