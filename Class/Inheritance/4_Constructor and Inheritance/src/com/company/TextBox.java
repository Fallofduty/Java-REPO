package com.company;

public class TextBox extends UIControl {
    // textbox inhertied from UIControl class
      private String textBox;
    public TextBox() {
        System.out.println("textBox Created");
    } // constructor is passed.

    public TextBox(boolean isEnabled, String textBox) {
        super(isEnabled); // constructor is passed. must have super
        this.textBox = textBox; // text box is passed here

    }
}
