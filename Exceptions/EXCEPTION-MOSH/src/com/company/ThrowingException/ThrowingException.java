package com.company.ThrowingException;

import java.io.IOException;

public class ThrowingException {

    public static void show(){
        var account = new Account();
        account.deposit(-1);

    }
    public static void show2() throws IOException {
        var account = new Account();
        try {
            account.deposit2(-1);
        } catch (IOException e) {
            System.out.println("eror happebned");
            throw e; // this will show any additonal error message i want to show
        }
    }
}
