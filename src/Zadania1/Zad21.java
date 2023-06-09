package Zadania1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Zad21 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double depositAmount;
        System.out.print("Podaj kwote depozytu: ");
        depositAmount = keyboard.nextDouble();


        double annualInterestRatePercent;
        System.out.print("Podaj roczną stopę oprocentowania (w %): ");
        annualInterestRatePercent = keyboard.nextDouble();
        double annualInterestRate = annualInterestRatePercent / 100;


        int capitalizationsPerYear;
        System.out.print("Podaj ile razy w roku odsetki są kapitalizowane: ");
        capitalizationsPerYear = keyboard.nextInt();


        int amountOfYears;
        System.out.print("Podaj na ile lat zdeponujesz kwotę: ");
        amountOfYears = keyboard.nextInt();


        double finalAmount = depositAmount *  pow(1 + annualInterestRate / capitalizationsPerYear, capitalizationsPerYear * amountOfYears);

        BigDecimal roundedFinalAmount = new BigDecimal(finalAmount).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Po " + amountOfYears +
                " latach na koncie będzie znajdować się: " + roundedFinalAmount.doubleValue());
    }

}
