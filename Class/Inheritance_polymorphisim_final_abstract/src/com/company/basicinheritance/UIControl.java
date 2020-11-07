package com.company.basicinheritance;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl() {
        System.out.println("UI CONTROL");
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }

    public void render(){} // this is empty just a abstract method


}
