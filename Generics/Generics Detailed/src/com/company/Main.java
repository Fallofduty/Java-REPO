package com.company;

import com.company.GenericClassesInheritance.Instructor;
import com.company.GenericSoloution_3.constriantedGenericList;
import com.company.GenericSoloution_3.contrainedList;
import com.company.genericMethods.Utlis;
import com.company.generics_1.List;
import com.company.GenericSoloution_3.GenericList;
import com.company.generics_1.User;
import com.company.gerics2poorSoloution_2.PoorListSoloution;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var list = new List();
        list.add(1); // add 1 to list;

        // ppor sosloution
        var poor_list_soloution = new PoorListSoloution();
        // poor_list_soloution.addItems(new User())
        // this can add any data no problem at all
        // int number = (int)list.get(0) will have to be casted speicalically
        // if not it will cause an error.


        // proper soloution
        new GenericList<Integer>().add(1); // this will only allow integer
        new GenericList<Exception>().add(new IOException()); // this will only take exception
        //<> decides what kind of excpetion willb e alowed.
        // more benifits
        var Stringlist = new GenericList<String>();
        Stringlist.add("hello"); // this boxing
        var value = Stringlist.get(0); // here there is no basting that is nedded // this is unboxing


      //  var number_list = new constriantedGenericList<Integer>(); // this will only allow number_list to be added.
        // string wont be allowed here as number classes only be allowed

       // var comparable_list = new contrainedList<Integer>(); // ineger uses comprable interface
       // var user_comparable = new contrainedList<User>();  // user implemeted constrained List so it will work fine. on user
        //user class implemetes user

        var user1 = new User(10);
        var user2 = new User(20);
        // user1<user2
        // put compare to then put the sign to compare
        if(user1.compareTo(user2)<0){
            System.out.println("user1<user2");
        }else if(user1.compareTo(user2)>0){
            System.out.println("user2<user1");
        }else {
            System.out.println("both are equal");
        }

        System.out.println(Utlis.maxGeneric(10,20)); // 20 will be returned
        System.out.println(Utlis.maxGeneric('a','b')); // returns b as b the higher has chode
        System.out.println(Utlis.maxGeneric(new User(10),new User(29))); // com.company.generics_1.User@16b98e56
        // because by default returns hash code default lets change the hashcode now to string method
        System.out.println(Utlis.maxGeneric(new User(10),new User(29))); //poibts=29 is returned

       Utlis.print(1,10); //1==10

        User user = new Instructor(10);
         //instructor has been upcasted
        Utlis.printUser(user); // poibts=10
        Utlis.printUser(new Instructor(20)); // poibts=20
        // can pass utilis here cause it is abstract concept from user.

        var users = new GenericList<Instructor>();
        //Utlis.printUser(users); // this will fail cause insturcotr of user is not same as insutrcutor generic only yakes one class
       Utlis.printUserListWIldCard(users);
    }

}