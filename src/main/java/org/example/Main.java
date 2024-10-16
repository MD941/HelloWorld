package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite željenu veličinu polja: ");
        int input = scanner.nextInt();
        System.out.println("Unesite sljedeći broj znakova: " + input);
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maksimalna vrijednost u polju je: " + Arrays.stream(arr).max().getAsInt());
    }
}