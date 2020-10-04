package com.company;

import java.text.NumberFormat;

public class MortageReport {

    private final NumberFormat currencyInstance;
    private  MortgageCalulator calculator;

    public MortageReport(MortgageCalulator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        calculator.getRemaningBalances();

        for(double balance : calculator.getRemaningBalances()){
            System.out.println(currencyInstance.format(balance));
        }
        

    }

    public void printMortgage() {

        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
