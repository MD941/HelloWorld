package org.example;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upišite za koliko proizvoda želite izračunati popust: ");
        int brojObjekata = scanner.nextInt();

        for (int i = 0; i < brojObjekata; i++) {
            izracunajPopust();
        }
    }

    public static void izracunajPopust() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upišite naziv proizvoda");
        String nazivProizvoda = scanner.nextLine();

        System.out.println("Upišite cijenu proizvoda");
        BigDecimal cijenaProizvoda = scanner.nextBigDecimal();

        System.out.println("Upišite popust proizvoda");
        BigDecimal popustProizvoda = scanner.nextBigDecimal();

        Proizvod proizvod = new Proizvod(nazivProizvoda, cijenaProizvoda);

        proizvod.postaviPopust(popustProizvoda);
        System.out.println("Cijena proizvoda nakon popusta je " + proizvod.izracunajCijenu());
    }



}
