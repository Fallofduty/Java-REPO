package com.company;

public class Person implements Chattable { // implements Chattable implements the interface class
    private String name;


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String chat(){
        return "hi";
    }

}
