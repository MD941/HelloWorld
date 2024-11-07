package org.example;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TekuciRacun tekuciRacun1 = new TekuciRacun("48846846468", BigDecimal.valueOf(186.3), "Ivan");
        tekuciRacun1.isplata(BigDecimal.valueOf(100));
        tekuciRacun1.getStanje();
    }

    }




