package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    var dispenser = new PezDisPenser();

// getter and setter in action
        System.out.printf("Th character in dispenser is %s \n",dispenser.getCharacterName());
        // Th character in dispenser is Yoda
        dispenser.setCharacterName("batman");
        System.out.printf("Th character in dispenser is now %s",dispenser.getCharacterName());
        // Th character in dispenser is now batman




        

    }
}
