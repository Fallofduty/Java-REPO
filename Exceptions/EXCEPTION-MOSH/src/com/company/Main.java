package com.company;

import com.company.CatchingExceptions.CatchingExceptions;
import com.company.CheckedExceptionDemo.CheckedExceptionDemo;
import com.company.CustomException.CustomException;
import com.company.Exceptionsdemo1.ExceptionDemo1;
import com.company.ThrowingException.ThrowingException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	  // this will show the basic of exceptions mostly
        //ExceptionDemo1.show();
        /*
        in the code with exception.demo.show()
        {
          sayHello(null); was passed
           // this will cause the NullPointer Exceptions
           // null cant be capitalized
        }
         */

        //implemetning exceptions with try and catch
        CatchingExceptions.show();
        //   output is the following
        //   file.txt (The system cannot find the file specified)
        //   file does not exist
        //
        // // in here file was never able to write to textfile
        // // text file does not exist
        // // so the best case was to use catch and statment there was excecuted.
        // System.out.println(ex.getMessage()); = file.txt (The system cannot find the file specified) this is message written defualt by program
        //  file does not exist // this is my own defined message
        CatchingExceptions.showCatchingMultipleExceptions();
        // there was a error reading the file
        // this showed the error for both not being able to read file and write file and date error
        CatchingExceptions.showCatchingMultipleExceptionswithFInally();
        //there was a error reading the file
        //file error not written sorry
        // thesse two things occured

        try {
            ThrowingException.show2();
        } catch (Throwable ex) {
            System.out.println("tprogram stopped working");
            // thorwable will work no matter what error is showed.
            //throwable is the parent okind of error
            //eror happebned
            //tprogram stopped working
        }

        CustomException.show(); // not enough momey will be used here
        CustomException.show2();

    }
}
