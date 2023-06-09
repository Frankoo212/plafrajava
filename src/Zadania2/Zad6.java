package Zadania2;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Opcje:");
        System.out.println("1. Zamień sekundy na dni, godziny, minuty i sekundy");
        System.out.println("2. Zamień dni, godziny, minuty i sekundy na sekundy");
        System.out.println("3. Oblicz różnicę między dwoma czasami");
        System.out.println("4. Oblicz sumę dwóch czasów");
        System.out.print("Wybierz opcję: ");

        int option = keyboard.nextInt();

        switch (option) {
            case 1 -> convertSecondsToTime();
            case 2 -> convertTimeToSeconds();
            case 3 -> calculateTimeDifference();
            case 4 -> calculateTimeSum();
            default -> System.out.println("Wybrano nieprawidłową opcję.");
        }
    }

    public static void convertSecondsToTime() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadź liczbę sekund: ");
        int seconds = keyboard.nextInt();
        int tempSeconds = seconds;

        int days = tempSeconds / 86400;
        tempSeconds %= 86400;

        int hours = tempSeconds / 3600;
        tempSeconds %= 3600;

        int minutes = tempSeconds / 60;
        tempSeconds %= 60;

        System.out.println(seconds + " sekund to " + days + " dni, " + hours + " godzin, " + minutes + " minut i " + tempSeconds + " sekund.");
    }


    public static void convertTimeToSeconds() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadź liczbę dni: ");
        int days = keyboard.nextInt();

        System.out.print("Wprowadź liczbę godzin: ");
        int hours = keyboard.nextInt();

        System.out.print("Wprowadź liczbę minut: ");
        int minutes = keyboard.nextInt();

        System.out.print("Wprowadź liczbę sekund: ");
        int seconds = keyboard.nextInt();

        int totalSeconds = (days * 86400) + (hours * 3600) + (minutes * 60) + seconds;

        System.out.println(days + " dni, " + hours + " godzin, " + minutes + " minut i " + seconds + " sekund to " + totalSeconds + " sekund.");
    }

    public static void calculateTimeDifference() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadź liczbę sekund pierwszego czasu: ");
        int seconds1 = keyboard.nextInt();

        System.out.print("Wprowadź liczbę sekund drugiego czasu: ");
        int seconds2 = keyboard.nextInt();

        int diffSeconds;
        if(seconds1 > seconds2) {
            diffSeconds = Math.abs(seconds1 - seconds2);
        } else {
            diffSeconds = Math.abs(seconds2 - seconds1);
        }

        int days = diffSeconds / 86400;
        diffSeconds %= 86400;

        int hours = diffSeconds / 3600;
        diffSeconds %= 3600;

        int minutes = diffSeconds / 60;
        diffSeconds %= 60;

        System.out.println("Różnica wynosi " + days + " dni, " + hours + " godzin, " + minutes + " minut i " + diffSeconds + " sekund.");
    }

    public static void calculateTimeSum() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadź liczbę sekund pierwszego czasu: ");
        int seconds1 = keyboard.nextInt();

        System.out.print("Wprowadź liczbę sekund drugiego czasu: ");
        int seconds2 = keyboard.nextInt();

        int sumSeconds = seconds1 + seconds2;

        int days = sumSeconds / 86400;
        sumSeconds %= 86400;

        int hours = sumSeconds / 3600;
        sumSeconds %= 3600;

        int minutes = sumSeconds / 60;
        sumSeconds %= 60;

        System.out.println("Suma wynosi " + days + " dni, " + hours + " godzin, " + minutes + " minut i " + sumSeconds + " sekund.");
    }

}
