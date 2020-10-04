package com.company;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) {
	var control = new UIControl(true);
	show(control); // com.company.UIControl@5f184fc6 this is a ui control
    var Textbox = new TextBox();
    show(Textbox); // its null cause its returning the text of the text which is null
    var textbox2 = new TextBox(false,"hello nafis");
    show(textbox2); // hello nafis is executed which is excuting to string method

    }

    public static void show(UIControl control){


        // control=> isdasble
        // control => is enabled only show up.
        // to use Textbox class must use casting
        if (control instanceof TextBox){
            var textbox = (TextBox)control; // downcasting is done so it wont cause crash.
        }

        System.out.println(control);
    }
}
