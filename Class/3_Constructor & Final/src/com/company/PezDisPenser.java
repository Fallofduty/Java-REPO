package com.company;

public class PezDisPenser {
    // naming conventions must be first letter must be upperCase and 2nd letter must be UpperCase  also

  final private String characterName; // this is final means can only be set ones.


   public PezDisPenser(String characterName){ // aded constructor to set the name;
       this.characterName = characterName;
   }

    public String getCharacterName(){
        return  characterName;
    }






}
