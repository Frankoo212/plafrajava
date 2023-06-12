package Zadania4;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad23 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = keyboard.nextLine();

        System.out.print("Opisz siebie: ");
        String description = keyboard.nextLine();

        System.out.print("Podaj ścieżkę do zdjęcia profilowego: ");
        String profilePicture = keyboard.nextLine();

        List<String> interests = new ArrayList<>();
        System.out.println("Podaj swoje zainteresowania (wpisz 'koniec' aby zakończyć): ");
        String interest;
        while (true) {
            interest = keyboard.nextLine();
            if (interest.equalsIgnoreCase("koniec")) {
                break;
            }
            interests.add(interest);
        }

        System.out.println("Dostosuj stylizację strony:");
        System.out.print("Podaj kolor tła (np. #f2f2f2 lub white): ");
        String backgroundColor = keyboard.nextLine();

        System.out.print("Podaj rozmiar czcionki (np. 14px): ");
        String fontSize = keyboard.nextLine();

        System.out.print("Podaj kolor nagłówków (np. #333 lub red): ");
        String headerColor = keyboard.nextLine();

        System.out.print("Podaj kolor tekstu (np. #333 lub red): ");
        String textColor = keyboard.nextLine();

        System.out.print("Podaj szerokość zdjęcia profilowego (np. 200px lub auto): ");
        String pictureWidth = keyboard.nextLine();

        System.out.print("Podaj wysokość zdjęcia profilowego (np. 200px lub auto): ");
        String pictureHeight = keyboard.nextLine();

        System.out.println("Jaką czcionkę wybierasz: ");
        System.out.println("Tahoma (1)");
        System.out.println("Georgia (2)");
        System.out.println("Arial (3)");
        System.out.println("Times New Roman (4)");
        System.out.println("Bahnschrift (5)");
        String pageFont = keyboard.nextLine();

        String html = generateHtml(name, description, profilePicture, interests);

        String css = generateCss(backgroundColor, fontSize, textColor, headerColor, pictureWidth, pictureHeight, pageFont);

        saveHtmlToFile(html);
        saveCssToFile(css);

        System.out.println("Plik HTML ze stylowaniem został wygenerowany.");
    }

    private static String generateHtml(String name, String description, String profilePicture, List<String> interests) {
        StringBuilder interestsHtml = new StringBuilder();
        for (String interest : interests) {
            interestsHtml.append("<li>").append(interest).append("</li>\n");
        }

        String htmlTemplate = """
                <!DOCTYPE html>
                <html>
                <head>
                <title>Profil użytkownika - %s</title>
                <link rel="stylesheet" type="text/css" href="styles.css">
                </head>
                <body>
                <h1>Profil użytkownika</h1>
                <table>
                <tr><th>Imię:</th><td>%s</td></tr>
                <tr><th>Opis:</th><td>%s</td></tr>
                </table>
                <img src="%s" alt="Zdjęcie profilowe">
                <h2>Zainteresowania:</h2>
                <ul>
                %s</ul>
                </body>
                </html>""";

        return String.format(htmlTemplate, name, name, description, profilePicture, interestsHtml);
    }

    private static String generateCss(String backgroundColor, String fontSize, String textColor, String headerColor, String pictureWidth, String pictureHeight, String pageFont) {

        String fontFamily;

        switch (pageFont) {
            case "1" -> fontFamily = "Tahoma";
            case "2" -> fontFamily = "Georgia";
            case "3" -> fontFamily = "Arial";
            case "4" -> fontFamily = "Times New Roman";
            case "5" -> fontFamily = "Bahnschrift";
            default -> fontFamily = "Comic Sans MS";
        }

        String cssTemplate = """
                body {
                    margin: 20px;
                    background-color: %s;
                    font-size: %s;
                    font-family: %s;
                    color: %s;
                }
                h1, h2 {
                    color: %s;
                }
                img {
                    width: %s;
                    height: %s;
                    margin-top: 20px;
                }""";

        return String.format(cssTemplate, backgroundColor, fontSize, fontFamily, textColor, headerColor, pictureWidth, pictureHeight);
    }

    private static void saveHtmlToFile(String html) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("profil.html"))) {
            writer.println(html);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania pliku HTML.");
            e.printStackTrace();
        }
    }

    private static void saveCssToFile(String css) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("styles.css"))) {
            writer.println(css);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania pliku CSS.");
            e.printStackTrace();
        }
    }
}

