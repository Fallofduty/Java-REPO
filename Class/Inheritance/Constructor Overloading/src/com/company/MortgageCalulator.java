package com.company;

public class MortgageCalulator {
   private static byte MONTHS_IN_YEAR = 12;
   private final static byte PERCENT = 100;

    private  int principal;
    private byte years;
    private float annualInterest;

    public MortgageCalulator(int principal, byte years, float annualInterest) {
        this.principal = principal;
        this.years = years;
        this.annualInterest = annualInterest;
    }



    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
    public double calculateBalance(short month) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = this.principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
    public double[] getRemaningBalances(){
        double [] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month-1]=calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return this.annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }




}
