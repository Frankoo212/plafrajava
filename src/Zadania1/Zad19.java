package Zadania1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad19 {

        public static void main(String[] args) {

            int numberOfPeople = 12467;
            double percentageOfBuyingPeople = 0.14;
            double percentageOfPeoplePreferingCytrusTaste = 0.64;


            double notRoundedNumberOfBuying = numberOfPeople * percentageOfBuyingPeople;
            double notRoundedNumberOfPreferCytrus = notRoundedNumberOfBuying * percentageOfPeoplePreferingCytrusTaste;


            BigDecimal roundedNumberOfBuying = new BigDecimal(notRoundedNumberOfBuying).setScale(1, RoundingMode.HALF_UP);
            BigDecimal roundedNumberOfPreferCytrus = new BigDecimal(notRoundedNumberOfPreferCytrus).setScale(1, RoundingMode.HALF_UP);

            System.out.println("Liczba ankietowanych osób, które kupują przynajmniej jeden napój energetyczny tygodniowo: " + roundedNumberOfBuying.intValue());
            System.out.println("Liczba ankietowanych osób, które preferują napoje energetyczne o smaku cytrusowym: " + roundedNumberOfPreferCytrus.intValue());

        }

}
