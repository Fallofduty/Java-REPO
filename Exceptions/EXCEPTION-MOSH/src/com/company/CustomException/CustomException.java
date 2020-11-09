package com.company.CustomException;

public class CustomException {

    public static void show(){
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsuffecnetfundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void show2(){
        var account = new Account();
        try {
            account.withdraw2(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
