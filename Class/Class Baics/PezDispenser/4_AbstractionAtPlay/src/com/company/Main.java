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
