package Zadania1;

public class Zad22 {

    public static void main(String[] args) {
        double commissionRate = 0.02;

        int numberOfPurchasedShares = 1000;
        double sharePurchasePrice = 32.87;
        double purchaseCommission = numberOfPurchasedShares * sharePurchasePrice * commissionRate;

        int numberOfSoldShares = 1000;
        double shareSalePrice = 33.92;
        double saleCommission = numberOfSoldShares * shareSalePrice * commissionRate;

        double amountPaidForShares = numberOfPurchasedShares * sharePurchasePrice;
        double amountReceivedForShares = numberOfSoldShares * shareSalePrice;

        double profit = amountReceivedForShares - amountPaidForShares - purchaseCommission - saleCommission;

        System.out.println("Kwota zapłaconą przez Jacka za akcje: " + amountPaidForShares);
        System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie: " + purchaseCommission);
        System.out.println("Kwota otrzymaną przez Jacka ze sprzedaży akcji: " + amountReceivedForShares);
        System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży: " + saleCommission);
        System.out.println("Zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji: " + profit);
    }

}
