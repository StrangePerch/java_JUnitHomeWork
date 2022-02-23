package com.company;

public class CurrencyConverter {
    public static double convertUSDtoEUR(double amount) {
        return amount * 0.88;
    }
    public static double convertUAHtoUSD(double amount) {
        return amount * 0.034;
    }
    public static double convertUAHtoEUR(double amount) {
        return amount * 0.030;
    }
    public static double convertEURtoUSD(double amount) {
        return amount * 1.13;
    }
    public static double convertEURtoUAH(double amount) {
        return amount * 33.22;
    }
    public static double convertUSDtoUAH(double amount) {
        return amount * 29.36;
    }
    public static double convertGBPtoUSD(double amount) {
        return amount * 1.35;
    }
    public static double convertUSDtoGBP(double amount) {
        return amount * 0.74;
    }
    public static double convertGBPtoUAH(double amount) {
        return amount * 39.79;
    }
    public static double convertUAHtoGBP(double amount) {
        return amount * 0.025;
    }
    public static double convertEURtoGBP(double amount) {
        return amount * 0.83;
    }
    public static double convertGBPtoEUR(double amount) {
        return amount * 1.20;
    }
}
