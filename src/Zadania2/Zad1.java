package Zadania2;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nJaką operację chcesz wykonać:");
        System.out.println("1. Zamień liczbę arabską na rzymską");
        System.out.println("2. Zamień liczbę rzymską na arabską");
        System.out.print("Wybierz opcję: ");

        int option = keyboard.nextInt();

        switch (option) {
            case 1 -> arabicToRoman();
            case 2 -> romanToArabic();
            default -> System.out.println("Wybrano nieprawidłową opcję.");
        }
    }

    public static void arabicToRoman() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("---Konwerter liczb arabskich na rzymskie---");
        System.out.println("-----Aby zakończyć program, wprowadź 0-----");
        System.out.print("Podaj liczbę z zakresu od 1 do 3999: ");
        String numberString = keyboard.nextLine();
        int number = Integer.parseInt((numberString));

        while (number != 0) {

            if (number < 1 || number > 3999) {
                System.out.println("Błędna wartość. Podana liczba musi należeć do przedziału od 1 do 3999.");
            } else {
                int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

                StringBuilder romanNumeral = new StringBuilder();

                int tempNumber = number;

                for (int i = 0; i < arabicValues.length; i++) {
                    while (tempNumber >= arabicValues[i]) {
                        romanNumeral.append(romanSymbols[i]);
                        tempNumber -= arabicValues[i];
                    }
                }

                System.out.println("Odpowiednik rzymski dla liczby " + number + " to: " + romanNumeral);
            }

            System.out.println("\n-----Aby zakończyć program, wprowadź 0-----");
            System.out.print("Podaj liczbę z zakresu od 1 do 3999: ");
            numberString = keyboard.nextLine();
            number = Integer.parseInt((numberString));

        }

        main(null);

    }

    public static void romanToArabic() {

        Scanner keyboard = new Scanner(System.in);

        int[] arabicValues = {1, 5, 10, 50, 100, 500, 1000};
        char[] romanSymbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        System.out.println("---Konwerter liczb arabskich na rzymskie---");
        System.out.println("-----Aby zakończyć program, wprowadź 0-----");
        System.out.print("Podaj liczbę z zakresu od I do MMMCMXCIX: ");
        String romNumber = keyboard.nextLine();

        while (!romNumber.equals("0")) {

            int result = 0;
            int previousValue = 0;
            int currentValue = 0;
            boolean proper = true;

            for(int i = romNumber.length() - 1; i >= 0; i--) {
                char currentSymbol = romNumber.charAt(i);

                for(int j = 0; j < romanSymbols.length; j++) {
                    if (romanSymbols[j] == currentSymbol) {
                        currentValue = arabicValues[j];
                    }
                }

                if(currentValue <= 0){
                    proper = false;
                }

                if (currentValue >= previousValue) {
                    result += currentValue;
                } else {
                    result -= currentValue;
                }

                previousValue = currentValue;

            }

            if (result > 0 & result < 4000 & proper) {
                System.out.println("Odpowiednik arabski dla liczby " + romNumber + " to: " + result);
            } else {
                System.out.println("Błędna wartość. Podana liczba musi należeć do przedziału od I do MMMCMXCIX.");
            }

            System.out.println("\n-----Aby zakończyć program, wprowadź 0-----");
            System.out.print("Podaj liczbę z zakresu od I do MMMCMXCIX: ");
            romNumber = keyboard.nextLine();

        }
        main(null);

    }

}
