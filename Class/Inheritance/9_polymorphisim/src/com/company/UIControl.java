package com.company;

public class UIControl {
    // UIControl class inherited from object class
    private boolean isEnabled;

    public UIControl() { // default constructor
        System.out.println("UI CONTROl Created ");
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return  isEnabled;
    }

public void render(){}

}
