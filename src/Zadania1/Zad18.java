package Zadania1;

public class Zad18 {

        public static void main(String[] args) {

            int numberOfShares = 600;
            double sharePrice = 21.77;
            double amountPaidForShares = numberOfShares * sharePrice;
            double transactionCommission = amountPaidForShares * 0.02;
            double totalAmountPaid = amountPaidForShares + transactionCommission;

            System.out.println("Kwota zapłacona za same akcje: " + amountPaidForShares +
                    "\nWysokość prowizji: " + transactionCommission +
                    "\nŁączna zapłacona kwota: " + totalAmountPaid);
        }

}