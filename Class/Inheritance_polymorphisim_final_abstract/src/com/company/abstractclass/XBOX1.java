package com.company.abstractclass;

public class XBOX1 extends GamingSystem {


    public XBOX1(String name, double unitSold) {
        super(name, unitSold);
    }

    @Override
    public void showinfo() {
        System.out.println("xbox sold less than ps4");
    }
}
