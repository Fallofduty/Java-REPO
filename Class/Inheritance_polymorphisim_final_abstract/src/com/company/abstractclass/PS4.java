package com.company.abstractclass;

public class PS4 extends GamingSystem {
    public PS4(String name, double unitSold) {
        super(name, unitSold);
    }

    @Override
    public void showinfo() {
        System.out.println("ps4 sold  more than xbox");
    }
}
