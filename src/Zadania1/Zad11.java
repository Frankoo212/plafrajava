package Zadania1;

import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartość kupowanego produktu: ");
        double value = keyboard.nextDouble();
        double stateTax = 0.04 * value;
        double localTax = 0.02 * value;
        double sellPrice = value + stateTax + localTax;
        System.out.println("Wartość produktu: " + value);
        System.out.println("Wartość podatku stanowego: " + stateTax);
        System.out.println("Wartość podatku lokalnego: " + localTax);
        System.out.println("Cena sprzedazy: " + sellPrice);
    }
}