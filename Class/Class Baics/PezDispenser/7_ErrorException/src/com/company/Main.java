package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    var dispenser = new PezDisPenser("batman"); // batman name will be set

        System.out.printf("The dispenser name is %s\n",dispenser.getCharacterName());
        //The dispenser name is batman

  try{
    dispenser.fill(12);  // if its 12 this will be executed
      //"pez accepted cause max pez is less or equal to 12"
      System.out.println("pez accepted");

  }catch (IllegalArgumentException iae){
      System.out.println(iae.getMessage());
  }


        try{
            dispenser.fill(400);
            System.out.println("pez accepted");

        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            /*
            iae is the nick for illegalarugment exception
            iae.getmessage will get the message from the fillclass
            public void fill(int pezAmount){ // function has been overwritten.
            int newAmount = pezAmount+pez_count;
            if(newAmount>Max_PEZ){
                throw new IllegalArgumentException("too many pez");
            }
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
