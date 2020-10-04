package com.company;

public class Main {


    public static void main(String[] args) {
     var control = new UIControl();

     control.disable(); // setting to to false

        System.out.println(control.isEnabled());//false now

        // this is the child class
        // has acess to both methods.
        var textBox = new TextBox();
        textBox.disable();
        System.out.println(textBox.isEnabled()); // false


    }
}
