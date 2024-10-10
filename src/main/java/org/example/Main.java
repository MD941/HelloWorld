package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int korisnikovInput;
        int zbroj = 0;

        System.out.println("Unesi broj dok ne pogodiš");
        korisnikovInput = scanner.nextInt();

        while (korisnikovInput != 0) {
            zbroj = zbroj + korisnikovInput;

            System.out.println("Pokusaj ponovo");
            korisnikovInput = scanner.nextInt();

        }
        System.out.println("Zbroj je " + zbroj);
    }
}