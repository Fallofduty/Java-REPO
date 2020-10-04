package com.company;

public class TextBox extends UIControl {

    private String textBox;
    public TextBox() {
        System.out.println("textBox Created");
    }

    public TextBox(boolean isEnabled, String textBox) {
        super(isEnabled);
        this.textBox = textBox;

    }

    @Override // this overidies it.
    public String toString() {
        return textBox;
    }
}
