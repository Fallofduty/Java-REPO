package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> grocceryLine; // use it as list on left on side makes it update easy
        grocceryLine = new ArrayList<>();

        //adding groceery line object
        grocceryLine.add("nafis");
        grocceryLine.add("beth");
        grocceryLine.add("sam");
        System.out.println(grocceryLine); // [nafis, beth, sam];

        grocceryLine.remove("beth");
        System.out.println(grocceryLine);//[nafis, sam]

        // moving by index
        grocceryLine.remove(0);

        System.out.println(grocceryLine); // [sam] nafis is gone

        // acessing arraylist;
          // get is nedded with index positon

        System.out.println(grocceryLine.get(0)); // sam
        grocceryLine.add("nafis");
        grocceryLine.add("beth");

        int samIndex = grocceryLine.indexOf("sam");
        System.out.println(samIndex); // 0 it was found. // if two is there only first one will be added thus index 0

        System.out.println(grocceryLine.indexOf("pam")); // -1; no match found

        System.out.println(grocceryLine.size()); // 3;


        //using for loop
        for (String name:grocceryLine) {
            System.out.printf("%s\n",name);
            /*
            sam
            nafis
            beth
             */
        }


    }
}
