package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var point1 = new Point(1,2);
        var point2 = point1;
        System.out.println(point1.equals(point2)); // =>true
        // this is true
        // cause     var point2 = point1 reference of point 1 passed into point two.
        // so both are equal
        var point3 = new Point(1,2);
        System.out.println(point1.equals(point3)); // => false
        // this is false however
        // both are from class isntanace
        // but addres are same so its false.
        //after overwrrding method
        System.out.println(point1.equals(point3)); // true
        var point4 = new Point(2,2);
        System.out.println(point3.equals(point4)); // false

        // lets try to pass a non object here
        System.out.println(point1.equals("hello")); // false
         // this is false cause point.equals does not equal to hello.
        System.out.println(point1.equals(point1)); // both are same so its true
        System.out.println(point1.hashCode()); // 994
        System.out.println(point2.hashCode()); // 994
        System.out.println(point3.hashCode()); // 994
        // all theese 3 has the same value
        System.out.println(point4.hashCode()); // different has code 1025 cause value is not the same
        //=> both has the same hash  code

        var point5 = new Point();
        System.out.println(point5.hashCode()); // 961
        System.out.println(point1.hashCode()); // 994
        // not the same hash code cause point 5 does not have the same value




    }
}
