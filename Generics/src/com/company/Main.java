package com.company;


import GenericClassesInheritiance.Instructor;
import GenericMethods.Utils;
import Generics.*;

import java.time.chrono.IsoChronology;

public class Main {

    public static void main(String[] args) {

    var list  = new GenericList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list.get(0)); // 1
    System.out.println(list.get(1)); // 2
    System.out.println(list.get(2)); // 3

    var stringList = new GenericList<String>();
    stringList.add("hello");
    stringList.add("world");
    System.out.println(stringList.get(0)); // hello
    System.out.println(stringList.get(1)); // world

    var charList = new GenericList<Character>();
    charList.add('c');
    charList.add('D');
    System.out.println(charList.get(0)); //c
    System.out.println(charList.get(1));// D

    var booleanList = new GenericList<Boolean>();
    booleanList.add(true);
    booleanList.add(false);

    System.out.println(booleanList.get(0)); //true
    System.out.println(booleanList.get(1)); // false

 var user1 = new User(10);
 var user2 = new User(20);
        System.out.println(user1.compareTo(user2)); // -10

        System.out.println(user1.compareTo(user2)>0); // false
        System.out.println(user1.compareTo(user2)<0); // true

//Generics methods
        System.out.println(Utils.max(1,2)); // 2
        System.out.println(Utils.max("a","b")); // b
        // comapring two non primitive objects
        //beore to string methods
        System.out.println(Utils.max(new User(10),new User(20)));
        // Generics.User@378bf509 this showed up.
        // cause by default to string method shows this.

        // +after modfying to string method
        System.out.println(Utils.max(new User(10),new User(20)));
        // points=20 is the result.
           // utils.max returns a T type return which can be anything based on what I decide.
           // since this returns a object which is T. to string method returns points which ever is the highest
     Utils.print(1,10); //1=10

        User user = new Instructor(10);

        Utils.printUser(user); // points=10

        var user_=new GenericList<User>();
        user_.add(new User(1));

       Utils.printUsers(user_); // generic type of instructor wont work here

      //explaning wild cards
        // usually starts with <?>
        // <?> in paramter means anything can be passed here
        // with instructor
        var instructorsList = new GenericList<Instructor>();
        Utils.printUsers_WildCard(instructorsList);
        Utils.printUsers_WildCard(user_);

    }
}
