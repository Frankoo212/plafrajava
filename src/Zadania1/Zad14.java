package Zadania1;

import java.util.Scanner;

public class Zad14 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double marks[] = new double[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Podaj ocenę z " + (i + 1) + " testu: ");
            marks[i] = keyboard.nextInt();
        }

        double average = (double) (marks[0] + marks[1] + marks[2]) / 3;
        for(int i = 0; i < 3; i++) {
            System.out.println("Wynik z " + (i + 1) + " testu: " + marks[i]);
        }
        System.out.println("Średnia ocen: " + average);

    }

}
