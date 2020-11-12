package com.company.gerics2poorSoloution_2;

import java.util.Objects;

public class PoorListSoloution {
    private Object [] items = new Object[10];
    private int count;
    public void  addItems (Objects item){
        items[count++] =item; // count goes up everytime new item is put
    }

    public Object get(int index){
        return items[index];// this returns a titem based on index
    }
}
