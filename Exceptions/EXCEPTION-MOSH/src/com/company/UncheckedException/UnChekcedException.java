package com.company.UncheckedException;

public class UnChekcedException {
    public static void show(){
        nullException(null); // this is a  null pointer exception
        arthmaticErrorException(4); // will cause arthmatic error cause number is divided by zeo
        IllegalarugmentException(-2); // this will show illegal arugment exception cause number cant be postive
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[4]); // this will cause index out of bound errors cause only 4 element

    }
    public static void nullException(String name){
        System.out.println(name.toUpperCase());
    }
    public static void arthmaticErrorException(int num){
        System.out.println(num/0);
    }
    public static void IllegalarugmentException(int num){
        if(num<=0){
            throw  new IllegalArgumentException("must be postive");
        }
    }

}
