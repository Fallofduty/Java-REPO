package com.company;

import exceptions.Account;
import exceptions.ExceptionsDemo;

public class Main {

    public static void main(String[] args) {

        //ExceptionsDemo.show();
     /* comment
     Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "name" is null
	at exceptions.ExceptionsDemo.sayHello(ExceptionsDemo.java:9)
	at exceptions.ExceptionsDemo.show(ExceptionsDemo.java:5)
	at com.company.Main.main(Main.java:9)
   in here the error occoirs at ththree level
   ExceptionsDemod.say hello where the error occours
   then on exceptions.exception.demp.show where the error happneds cause the fuction is being called there
   com.company.Main.main(Main.java:9) where the error is happeding.
   pay attention here exceptions on eveything
      */

      /*exception Notes
      Java has 3 types of exceptions
      1checked -->checked at compile time for example lets say ; is missing thats a run time exception
     2 unchcked -->run time happends when program is running.
          -->nullpointerexception
          -->illegal arugment exceptions
          -->arthmatic exception
          ->indexoutofbound exceptions
     3 error ->out of memory error,let it crash. can happned due to hardware.

       */

     /*
     exception rankings
     1.thorwable
     2.Exceptions (checked and unchecked parents) and error
     3)runtime excptions -->unchecked
      */
      //normal exceptions
  ExceptionsDemo.show(); // file does not exist here exception message is thrown here instead of program crashing

        //exceptions with multiple message
        ExceptionsDemo.show();
  /*
  file does not exist here
file opened
both lined show up cause
catch{System.out.println("file does not exist here");
            System.out.println("file opened");
            has two lines undeneath
   */

        ExceptionsDemo.show();
        /*
        file does not exist here
        file opened
        catch (FileNotFoundException ex) { //ex is the shortname for exceptions
            System.out.println("file does not exist here");
        }
            System.out.println("file opened");
    } iSystem.out.println("file opened"); is outside try and catch block so it will open
         */
        ExceptionsDemo.showVersion2(); // file not found
        //only one will show which error came first which was file not found

        try {
            ExceptionsDemo.showAccount();
        } catch (Throwable e) {
            System.out.println("unexpected error happends");
        }

    }


}
