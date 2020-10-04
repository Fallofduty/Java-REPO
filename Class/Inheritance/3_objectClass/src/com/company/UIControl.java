package com.company;

public class UIControl {
    // UIControl class inherited from object class

    private boolean isEnabled = true;

    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return  isEnabled;
    }
}