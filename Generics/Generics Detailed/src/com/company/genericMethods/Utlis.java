package com.company.genericMethods;

import com.company.GenericSoloution_3.GenericList;
import com.company.generics_1.User;

public class Utlis {

    public static int max(int first,int second){
        return (first>second)?first:second;
    }

    public static <T extends Comparable <T>> T maxGeneric(T  first,T second){
       return (first.compareTo(second)<0)?second:first;
       // in here T is being passsed so its is not type casted
        // in here thus any obkjct that uses comparable interface will work
        //  <T extends Comparable <T>> means only same type can be compared with each other
    }

    public static <k,v> void print(k key,v value){
        System.out.println(key +" = "+value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }
    public static void printUserList(GenericList<User> users){

    }
    public static void printUserListWIldCard(GenericList<? extends User> users){
//?means wild card // this will only allow user or sub classes to be allowed here.
    }


}
