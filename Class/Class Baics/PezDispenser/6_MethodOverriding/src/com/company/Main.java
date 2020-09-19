package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    var dispenser = new PezDisPenser("batman"); // batman name will be set

        System.out.printf("The dispenser name is %s\n",dispenser.getCharacterName());
        //The dispenser name is batman

   dispenser.fill(4);
   dispenser.fill(2);


    int count = 1;
    while (dispenser.dispense()){
    System.out.println("chomp:"+count);
    count++;
    /* this will go 6 times cause fill in line 12 and 13 went twice.
    chomp:1
    chomp:2
    chomp:3
    chomp:4
    chomp:5
    chomp:6
    */


}



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
