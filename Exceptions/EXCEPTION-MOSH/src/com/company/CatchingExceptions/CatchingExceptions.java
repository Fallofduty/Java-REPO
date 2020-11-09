package com.company.CatchingExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CatchingExceptions {
   public static void show(){
       try {
           var reader = new FileReader("file.txt");
           // this is is going to be trited to excute
           // if it fail it will move to exceptions.
       } catch (FileNotFoundException ex) {
           System.out.println(ex.getMessage());
           System.out.println("file does not exist");
       }
   }

   public static void showCatchingMultipleExceptions(){
       try {
           var reader = new FileReader("file.txt");
           var value = reader.read();
           new SimpleDateFormat().parse("");
           // this is is going to be trited to excute
           // if it fail it will move to exceptions.
       } catch (IOException | ParseException ex ) {

           System.out.println("there was a error reading the file");
           // IOexception is the parent of all the exceptions related to file reading and writting
           //| think it of a | or sign.
       }
   }

    public static void showCatchingMultipleExceptionswithFInally(){
       FileReader reader = null; // must be intalized or it wont work
        try {
             reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
            // this is is going to be trited to excute
            // if it fail it will move to exceptions.
        } catch (IOException | ParseException ex ) {

            System.out.println("there was a error reading the file");

        }finally {
            if(reader !=null){
            // must close the file for it wont close and take up memory
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("file error not written");
                }
           // will always get excecuted no matter what.
            }
                System.out.println("file error not written sorry");
        }
    }

    public static void CatchingExceptionWithResources(){
        try (
                var reader = new FileReader("file.txt");
                var writter = new FileWriter("...");

        ) {
             // the value is being intialized at the top
             // finally does not need to close it
             // java will close it automatically
            // writter lets use create multiple objects
            var value = reader.read();
            new SimpleDateFormat().parse("");
            // this is is going to be trited to excute
            // if it fail it will move to exceptions.
        } catch (IOException | ParseException ex ) {

            System.out.println("there was a error reading the file");

        }finally {
            System.out.println("thx have a great day");
        }

    }
}
