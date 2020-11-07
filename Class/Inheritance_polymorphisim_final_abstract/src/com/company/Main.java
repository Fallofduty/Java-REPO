package com.company;

import com.company.abstractclass.GamingSystem;
import com.company.abstractclass.PS4;
import com.company.abstractclass.XBOX1;
import com.company.basicinheritance.Point;
import com.company.basicinheritance.TextBox;
import com.company.basicinheritance.UIControl;
import com.company.polymorphisim.checkbox;

public class Main {

    public static void main(String[] args) {
	// 1 - basic inhertiance
        var control = new UIControl(); // by drfault it is enabled then become disabled.
        control.disable(); // disabled to false

        control.enable(); // this will be true now

        var textbox = new TextBox();
        textbox.setText("hello world");
        //textbox.clear();                                                                                                                                                      =
        textbox.enable();
        textbox.disable();
        // theese things got all the characters

        var box1 = new TextBox();
        System.out.println(box1); //com.company.basicinheritance.TextBox@568db2f2 shows where the package is
        System.out.println(box1.hashCode()); // 1452126962  map to numerous value it // used for comparing equauly
        var box2 = new TextBox();
        System.out.println(box2);
        System.out.println(box1.equals(box2));   // this will be false cause both are on different location
        System.out.println(box1.toString());
        // com.company.basicinheritance.TextBox@568db2f2
        // gives package class and hascode and hexa decimal 
       
      
        // constructour and inderitance
       var box3= new TextBox();
       /*
       UI CONTROL
       TEXTBOX
       both of thesse showed up here first is UI CONTROL
       text is TEXTBOX
       
       */

        textbox.setText("hello world");
        System.out.println(textbox.toString());        // hello world method has been overwritten

        //upcastibng and downcasting
        
           //upcasting and downcasting

        show(control);   // com.company.basicinheritance.UIControl@378bf509 this is the output as the to string method has bot been overwritten
        show(textbox);  // returns hello world cause that was the to string method to return hello world.
        // this is fine cause textbox is a control it is a is a relationship
        //up casting
       // show2(control);   // this will cause errors. as

         show2(control);

         var point1 = new Point(1,2);
         var point2 = new Point(1,2);
        System.out.println(point1.equals(point2));            // now it is true
        /*
        this is false by default
        bacuse both of them has different memory has not been overwritten
         */
        // after implemting
        System.out.println(point1.equals(point2));

        System.out.println(point1.hashCode()); //994
        System.out.println(point2.hashCode()); //994 has the same hashcode

        //polymorphisim
        UIControl [] controls = {new TextBox(),new checkbox()};

        for (var con :controls) {
            con.render();      // render textbox
             //render checkbox


        }

      //abstract method
        GamingSystem [] gamesystem = {new PS4("ps4",110),new XBOX1("XBOX ONE",40)};
        for (var game:gamesystem){
            game.showinfo();
            /*
            ps4 sold  more than xbox
            xbox sold less than ps4 */
        }

    }
    public static void show(UIControl control){
        System.out.println(control);
    }
    public static void  show2(UIControl control){
        if(control instanceof TextBox){
           // in here control is inherited from parent class
           // also textbox is in herited from parent class of UICONTROl
           // so control is instace of textbox here
       var textbox = (TextBox)control; // this is being downcasted
        textbox.setText("hello world");
        }
        System.out.println(control);
    }




}
