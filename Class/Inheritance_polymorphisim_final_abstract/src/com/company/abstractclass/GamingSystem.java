package com.company.abstractclass;

public  abstract class GamingSystem {
    public String name;

    public GamingSystem(String name, double unitSold) {
        this.name = name;
        this.unitSold = unitSold;
    }

    public double unitSold;

    public abstract void showinfo();
}
