package Zadania1;

import java.util.Scanner;

public class Zad15 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double retailCDPrice;
        System.out.print("Podaj detaliczną cenę płytki: ");
        retailCDPrice = keyboard.nextDouble();

        double margin = 0.4;
        double profit = retailCDPrice * margin;
        System.out.println("Zysk ze sprzedaży płytki wynosi: " + profit);

    }

}