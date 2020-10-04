package com.company;

public abstract class UIControl { // other class will not be insiatied
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

public abstract void render(); // curly {} braces is not needed just annouce it here

}
