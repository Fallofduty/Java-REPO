package com.company;

public final class TextBox extends UIControl { // final means no other class get from it

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

    @Override
    public void render() {
        System.out.println("rendring textbox");
    }
}
