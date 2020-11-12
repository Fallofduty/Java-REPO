package com.company.generics_1;

public class List {
    private int [] items = new int[10];
    private int count;
    public void  add(int item){
        items[count++] =item; // count goes up everytime new item is put
    }

    public int get(int index){
        return items[index];// this returns a titem based on index
    }
}
