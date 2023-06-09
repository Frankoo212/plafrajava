package Zadania1;

import java.util.Scanner;

public class Zad12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double kilometersTravelled;
        int litersOfFuel;
        System.out.println("Ile kilometrów przejechałeś? ");
        kilometersTravelled = keyboard.nextDouble();
        System.out.println("Ile litrów paliwa zużyłeś? ");
        litersOfFuel = keyboard.nextInt();
        double kilometersPerLiter = kilometersTravelled / litersOfFuel;
        System.out.println("Kilometry przejechane na litr paliwa: " + kilometersPerLiter);
    }

}
