package Zadania1;

import java.util.Scanner;

public class Zad23 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double rowLength;
        System.out.print("Podaj długość rzędu (w metrach): ");
        rowLength = keyboard.nextDouble();


        double necessarySpaceForGrating;
        System.out.print("Podaj potrzebne miejsce na okratowanie (w metrach): ");
        necessarySpaceForGrating = keyboard.nextDouble();


        double distanceBetweenSeedlings;
        System.out.print("Podaj odległość między sadzonkami (w metrach): ");
        distanceBetweenSeedlings = keyboard.nextDouble();

        double amountOfSeedlingsInRow = (rowLength - 2 * necessarySpaceForGrating) / distanceBetweenSeedlings;

        System.out.println("W rzędzie zmieści się " + Math.floor(amountOfSeedlingsInRow) + " sadzonek.");

    }

}
