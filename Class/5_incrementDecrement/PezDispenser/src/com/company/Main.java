package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    var dispenser = new PezDisPenser("batman"); // batman name will be set

        System.out.printf("The dispenser name is %s\n",dispenser.getCharacterName());
        //The dispenser name is batman


        System.out.printf("The max dispenser in a pez is  %s\n",PezDisPenser.Max_PEZ);
        //The max dispenser in a pez is  10


        System.out.println(dispenser.isEmpty()); // true;
        // this is true cause the pez dispenser is empty// .

        dispenser.fill();// pez is being filled;

        System.out.println(dispenser.isEmpty()); // false;
        // dispenser has been filled with .fill() is no longer is empty.


     checkIfDispenserEmptyOrNot(dispenser); // dispenser is not empty cause its full .
int count = 1;
while (dispenser.dispense()){
    // will keep returning  untill it becomes false.
    // this is true cause dispense is never empty untill it becomes 10;

    System.out.println("chomp:"+count);
    count++;
    /*
    chomp:1
    chomp:2
    chomp:3
    chomp:4
    chomp:5
    chomp:6
    chomp:7
    chomp:8
    chomp:9
    chomp:10
    chomp:11
    chomp:12
    in here chomp executed 12 times cause the size is 12.
    first it checks with dispenser.dispense() //
    first is true;
    2nd is true
    3rd is true
    4th is true
    5th is true
    6th is true
    7th is true
    8th is true
    9th is true
    10 us true
    11 is true
    12 is true.
    13 is fianlly false cause it finally became empty
     */
}

        checkIfDispenserEmptyOrNot(dispenser);
        

    }

    public static void  checkIfDispenserEmptyOrNot(PezDisPenser dispenser){

        if(dispenser.isEmpty()){

            System.out.println("dispenser is empty");
        }
        else if(!dispenser.isEmpty()){  // this negates to !dispenser method.
            System.out.println("dispenser is not empty");

        }
    }
}
