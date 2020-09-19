package com.company;

public class PezDisPenser {
    // naming conventions must be first letter must be upperCase and 2nd letter must be UpperCase  also

   private String characterName = "Yoda"; // can not be acessed

    public String getCharacterName(){ // this a getter must return same value as the property being gotten
        return  characterName;
    }

    public void setCharacterName(String characterName){
        /* this is a getter
        takes parameter String charactername
        cause characterName = "Yoda" is getting changed to something else.

         */
        this.characterName = characterName;
    }




}
