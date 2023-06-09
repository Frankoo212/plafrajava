package Zadania1;

import java.util.Scanner;

public class Zad17 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Cena: ");
        double price = keyboard.nextDouble();
        double tax = price * 0.0675;
        double tip = (price + tax) * 0.2;
        double endPrice = price + tax + tip;

        System.out.println("Cena: " + price + "\nPodatek: " + tax +
                "\nNapiwek: " + tip + "\nSuma: " + endPrice);

    }

}