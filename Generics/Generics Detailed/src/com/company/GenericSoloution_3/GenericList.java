package com.company.GenericSoloution_3;

public class GenericList <T>{
    //T is for type and template
    //E which is for element of collenction store many elements
    //type of objects this thing can store on the list
    private T[] items = (T[])new Object[10];
    // this same as declaring int[] onlt difference is i am using t[]
    // also (T[])new Object[10]; means the obkject is being downcasted
private int count;
    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }
}
