package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UIControl [] controls = {new TextBox(),new CheckBox()};

        controls[0].render(); // => rendring textbox is done here
        controls[1].render(); // =>redering checkbox is done here
        // polymorphisim is taking form here of many different forms.
    }
}
