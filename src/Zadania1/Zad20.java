package Zadania1;

import java.util.Scanner;

public class Zad20 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double glassesOfSugar = 1.5;
        double glassesOfButter = 1;
        double glassesOfFlour = 2.75;

        double expectedNumberOfCookies;
        System.out.print("Podaj ile ciasteczek chcesz zrobić: ");
        expectedNumberOfCookies = keyboard.nextDouble();

        double proportions = expectedNumberOfCookies / 48;
        double requiredGlassesOfSugar = glassesOfSugar * proportions;
        double requiredGlassesOfButter = glassesOfButter * proportions;
        double requiredGlassesOfFlour = glassesOfFlour * proportions;

        System.out.println("Do upieczenia " + expectedNumberOfCookies +
                " ciasteczek, potrzeba: \n" + requiredGlassesOfSugar +
                " szklanki cukru\n" + requiredGlassesOfButter +
                " szklanki masła\n" + requiredGlassesOfFlour + " szklanki mąki\n");

    }

}
