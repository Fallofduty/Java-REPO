package com.company.ThrowingException;

import java.io.IOException;

public class Account {
    public void deposit(float value){
        if(value<0){
            throw new IllegalArgumentException(); // we have passed illegal arugments
            // this is defiensive programming
            // if negative is passed this stops the program from running
            // this is defensive programiing in action

        }
    }

    public void deposit2(float value) throws IOException { // shows what kidn of exception it will throw
        if(value<=0){
            throw  new IOException();
            // in here just the exception will be thrown
            // when the exception is callled caller of the meethod will handle it
            // file reader will handle it
            //api of the method
        }
    }
}
