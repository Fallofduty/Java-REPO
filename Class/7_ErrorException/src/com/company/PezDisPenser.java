package com.company;

public class PezDisPenser {
    // naming conventions must be first letter must be upperCase and 2nd letter must be UpperCase  also

    final private String characterName;
    final public static int Max_PEZ=12;
    private  int pez_count;
    /* static means class based
       no other instances can acess it
       only class can acesss it.
     */


   public PezDisPenser(String characterName){ // aded constructor to set the name;
       this.characterName = characterName;
       pez_count = 0;
   }


    public String getCharacterName(){
        return  characterName;
    }

    public boolean isEmpty(){

      return pez_count == 0 ; // will reutrn true or false if pez dispenser is 0.
    }



    public boolean dispense(){

       boolean wasDispenced = false;
       if(!isEmpty()){
           pez_count--;
           wasDispenced = true;
       }
       return wasDispenced;
    }
    public void fill(){ // fill is the default.
        fill(Max_PEZ);
    }

    public void fill(int pezAmount){ // function has been overwritten.

    if(pezAmount>Max_PEZ){ // check if its greater than 12 or not
        throw new IllegalArgumentException("too many pez"); // exception is thrown
    }
    else {


        pezAmount+=pez_count;
    }



    }





}
