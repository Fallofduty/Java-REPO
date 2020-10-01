package com.company;

public class TeaCup implements Chattable {


    @Override
    public String chat() { // has to be public or it wont work
        return "hi i am a tea cup";
    }
}
