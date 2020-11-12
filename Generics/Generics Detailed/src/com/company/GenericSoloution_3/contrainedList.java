package com.company.GenericSoloution_3;

public class contrainedList <T extends Comparable & Cloneable> {
    // & used to seperate what constraits can be pseed
    private T[] items = (T[])new Object[10];
    // this same as declaring int[] onlt difference is i am using t[]
    // also (T[])new Object[10]; means the obkject is being downcasted
    private int count;
    public void add(T item){
        items[count++] = item;
    }
    public T get(int index) {
        return items[index];
    }
}
