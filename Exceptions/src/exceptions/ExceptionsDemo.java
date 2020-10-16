package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException ex) { //ex is the shortname for exceptions
            System.out.println("file does not exist here");
        }
        System.out.println("file opened");
    }

    public static void showVersion2() {
        try {
            var reader = new FileReader("data.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("did not catch the file");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void showVersion3() {
        try {
            var reader = new FileReader("data.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("could not find data");
        }
    }

    public static void showVersion4() {
        FileReader reader = null;
        try {
            reader = new FileReader("data.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("could not find data");
        } finally {
            if (reader != null) {

                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void showVersion5() throws IOException, ParseException {

        try (
                var reader = new FileReader("data.txt");
                var writter = new FileWriter("...")

        ) {

            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("could not find data");
            throw e;
        }
    }

    public static void showAccount() throws IllegalAccessException {

        var acount = new Account();
        try {
            acount.Deposit(-1);
        } catch (IllegalAccessException e) {
            throw e;
        }
    }

    public static void WithDraw()  {

        var account = new Account();
        try {
            account.withdrawMoney(10);
        } catch (InsuiffcentFundExceptions ex) {
            System.out.println(ex.getMessage());
        }

    }public static void WithDrawMoney2()  {

        var account = new Account();
        try {
            account.withdrawMoney2(10);
        } catch (AccountExceptions e) {
            System.out.println(e.getMessage());
        }

    }

}



