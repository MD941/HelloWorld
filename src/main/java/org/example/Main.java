package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Horvat", "23232133");
        Student student2 = new Student("Matija", "Lukec", "23232132");
        Student student3 = new Student("Ivan", "Kukec", "232321311");


        try (PrintWriter out = new PrintWriter("studenti.txt")) {
            out.println(student1.getIme() + " " + student1.getPrezime() + " " + student1.getBrIndexa());
            out.println(student2.getIme() + " " + student2.getPrezime() + " " + student2.getBrIndexa());
            out.println(student3.getIme() + " " + student3.getPrezime() + " " + student3.getBrIndexa());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        int c = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("studenti.txt"))) {
            while (bufferedReader.read() != -1) {
                c++;
            };
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ;
        System.out.println(c);
    }
}



