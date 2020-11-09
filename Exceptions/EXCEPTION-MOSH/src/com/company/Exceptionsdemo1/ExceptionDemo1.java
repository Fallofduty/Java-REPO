package com.company.Exceptionsdemo1;

public class ExceptionDemo1 {
    public static void show(){
        sayHello(null);
    }
    public static void   sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
