package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var box1 = new TextBox();
        System.out.println(box1.hashCode()); // 1072408673 hash code of the object
        var box2 = box1; // box1 will have the same hashcode
        System.out.println(box1==box2);//box1 and box 2 are equal =>true
        // both are refrencing same location on the memory.
        System.out.println(box1.equals(box2)); // true


        var box3 = new TextBox();
        System.out.println(box3.equals(box1)); // false they do not share same hash code


    }
}
