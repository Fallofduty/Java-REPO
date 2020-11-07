package com.company.basicinheritance;

import javax.print.DocFlavor;

public class TextBox  extends UIControl{
    public String text ="";

    public TextBox(boolean isEnabled, String text) {
        super(isEnabled); // is enabled is passed is needed as this part of cbild class
        this.text = text;
    }

    public TextBox() {
        System.out.println("TEXTBOX");
    }

    public void setText(String text){this.text=text;}
    public void clear() {this.text="";}

    @Override
    public String toString() {
        return  text;
    }

    @Override
    public void render() {
        System.out.println("renderig textbox");
    }
}
