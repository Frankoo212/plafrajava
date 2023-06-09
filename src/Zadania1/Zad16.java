package Zadania1;

import java.util.Scanner;

public class Zad16 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String cityName;

        System.out.print("Podaj nazwę miasta: ");
        cityName = keyboard.nextLine();

        int numberOfCharactersInCityName = cityName.length();
        String upperCityName = cityName.toUpperCase();
        String lowerCityName = cityName.toLowerCase();
        char firstCharOfCityName = cityName.charAt(0);

        System.out.println("Miasto: " + cityName + "\nIlość znaków w nazwie: " + numberOfCharactersInCityName +
                "\nNazwa miasta napisana dużymi literami: " + upperCityName +
                "\nNazwa miasta napisana małymi literami: " + lowerCityName +
                "\nPierwszy znak w nazwie: " + firstCharOfCityName);

    }

}