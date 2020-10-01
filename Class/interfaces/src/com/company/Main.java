package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
      ShopKeeper shopKeeper = new ShopKeeper("larry");
      var teacup = new TeaCup();

      String treehouse = "treehouse";

      Object[]objects = {shopKeeper,teacup,treehouse};

        for (Object object:objects) {
            if(object instanceof  TeaCup){
                System.out.println(((TeaCup)object).chat());
            }else if(object instanceof ShopKeeper){
                System.out.println(((ShopKeeper)object).chat());
            }else if(object instanceof String){
                System.out.println(((String) object).toUpperCase());
            }
        }

        /*
        hi i am shop keeper
        hi i am a tea cup
        TREEHOUSE
         */

        for (Object object: objects) {
            if(object instanceof Chattable){
                String response = (((Chattable) object).chat());
                System.out.println(response);
            }
            /* printing thesse two
            hi i am shop keeper
            hi i am a tea cup
            // both are not same but implemeted chat method from interfaces
             */

        }

        Chattable[] chattables = {shopKeeper, teacup};


        for (Chattable chattable : chattables) {
            String response = chattable.chat();
            System.out.println(response);
            /*
            hi i am shop keeper
            hi i am a tea cup
             */
        }

        Sellers[] seller = {shopKeeper};

        seller[0].sellGoods(); // sells lot of stuff // no casting is needed 




    }
}
