package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner scanner = new Scanner(System.in);
        int trazeniBroj = scanner.nextInt();

        List<Integer> listaBrojeva = new ArrayList<>(trazeniBroj);
//        2 4 5 6 5
        for (int i = 0; i < trazeniBroj; i++) {
            listaBrojeva.add(scanner.nextInt());
        }
//2-4       5-6
//          5-5      6-5
//
//2-5
//2-6
//2-5
//
//4-5
//4-6
//4-6
        for (int j = 0; j < listaBrojeva.size(); j++) {
            int brojKojiProvjeravamo = listaBrojeva.get(j);

            for (int z = j + 1; z < listaBrojeva.size() - 1; z++) {
                int broj = listaBrojeva.get(z);
                boolean isIt = brojKojiProvjeravamo ==  broj;
            }


        }
    }
}