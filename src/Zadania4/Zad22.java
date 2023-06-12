package Zadania4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Zad22 {

    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int insertedMoney = 0;
        int totalWinningAmount = 0;

        boolean playing = true;

        while (playing) {
            clrscr();
            System.out.print("Podaj kwotę pieniędzy, jaką chcesz wrzucić do automatu: ");
            int amount = keyboard.nextInt();

            insertedMoney += amount;

            String[] images = {"1", "2", "3", "4", "5", "7"};

            String image1 = images[random.nextInt(images.length)];
            String image2 = images[random.nextInt(images.length)];
            String image3 = images[random.nextInt(images.length)];

            String jackpotTemplate =
                    """
                                           .-------.
                                           |Automat|
                               ____________|_______|____________
                              |=================================|
                              |   ___   ___    ___    __ __  __ |
                              |  /   \\ /___\\  / _ \\  / //__\\/__\\|
                              | / /\\ ///  // / /_\\/ / //_\\ / \\//|
                              |/ /_/// \\_// / /_\\\\ / ///__/ _  \\|
                              |\\___/ \\___/  \\____//_/ \\__/\\/ \\_/|
                              |                                 |
                              |===_______===_______===_______===| __
                              ||*| _____ |*| _____ |*| _____ |*||(__)
                              ||*||     ||*||     ||*||     ||*|| ||
                              ||*||* %s *||*||* %s *||*||* %s *||*|| ||
                              ||*||_____||*||_____||*||_____||*|| ||
                              ||*|_______|*|_______|*|_______|*||_//
                              |===_______===_______===_______===|_/
                              |  /___________________________\\  |
                              |   |                         |   |
                             _|    \\_______________________/    |_
                            (_____________________________________)
                                                      
                            """
            ;

            clrscr();

            System.out.printf(jackpotTemplate, " ", " ", " ");

            for (int i = 0; i < 15; i++) {
                Thread.sleep(100);
                clrscr();
                System.out.printf(jackpotTemplate, images[random.nextInt(images.length)], " ", " ");
            }

            for (int i = 0; i < 15; i++) {
                Thread.sleep(100);
                clrscr();
                System.out.printf(jackpotTemplate, image1, images[random.nextInt(images.length)], " ");
            }
            for (int i = 0; i < 15; i++) {
                Thread.sleep(100);
                clrscr();
                System.out.printf(jackpotTemplate, image1, image2, images[random.nextInt(images.length)]);
            }

            clrscr();
            System.out.printf(jackpotTemplate, image1, image2, image3);


            if (image1.equals(image2) && image2.equals(image3)) {
                int winningAmount = amount * 3;
                totalWinningAmount += winningAmount;
                System.out.println("Gratulacje! Wygrałeś " + winningAmount + " złotych.\n");
            } else if (image1.equals(image2) || image1.equals(image3) || image2.equals(image3)) {
                int winningAmount = amount * 2;
                totalWinningAmount += winningAmount;
                System.out.println("Gratulacje! Wygrałeś " + winningAmount + " złotych.\n");
            } else {
                System.out.println("Niestety, tym razem nie wygrałeś żadnych pieniędzy.\n");
            }

            System.out.println("Czy chcesz zagrać ponownie? (Tak/Nie)");
            String answer = keyboard.next();

            while (!(answer.equalsIgnoreCase("Nie") || answer.equalsIgnoreCase("Tak"))) {
                System.out.println("Wybrano nieprawidłową opcję.");
                System.out.println("Czy chcesz zagrać ponownie? (Tak/Nie)");
                answer = keyboard.next();
            }

            if (answer.equalsIgnoreCase("Nie")) {
                playing = false;
            }
        }

        int finalAmount = totalWinningAmount - insertedMoney;
        System.out.println("\nLiczba wrzuconych pieniędzy: " + insertedMoney + " złotych\n");
        System.out.println("Liczba wygranych pieniędzy: " + totalWinningAmount + " złotych\n");
        System.out.println("Ostateczny rozrachunek: " + finalAmount + " złotych\n");
    }


    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
