package com.company;

public  class ShopKeeper extends Person implements Sellers {
    public ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() { // overwritten;
        return "hi i am shop keeper";
    }

    @Override
    public void sellGoods() {
        System.out.println("sells lot of stuff");
    }
}
