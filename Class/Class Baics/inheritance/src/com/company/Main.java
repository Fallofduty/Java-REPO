package com.company;

public class Main {

    public static void main(String[] args) {
     var dog = new Dog("bow");
     dog.makeSound();  // dog has acess to makesound.

        Object [] list = {new Dog(),new DogFood(),new Dog("bark")};
         Dog dog1 = (Dog) list[0];
         var dog2 = (Dog)list[2]; // casting is being done here
         dog2.makeSound(); // bark can be acessed here

        // do without variable
        ((Dog)list[2]).makeSound();
        // in here both dog and list are on bracket so its easy to acess.

        // using for loop to loop though object
        for (Object obj: list) {
            if(obj instanceof Animal){ // instance is a keyword that checks facts.
                ((Dog) obj).makeSound();
                //((Animal)obj).age() // not acessible cause it only belongs to dog class
                /*
                null
                bark  both showed up.
                also ((Animal) obj).makeSound(); woould work fine too;
                 */
            }
        }
        System.out.println(dog.toString()); // Dog : Sound =bow
        /*
         return getClass().getSimpleName() + " : Sound =" + sound;
          getClass() is needed to aces the class object.
          getsimple name returns the name of the object
          sound will return the sound

         */
        dog.makeSound();
        /*
        bow // will come first (this will be taken out if the super is taken out);
    wags tale // then wags tale
         */
      dog.findFood();
      /*
      looks at human
wags tale
       */
        //before has code intalization
        var dog3 = new Dog();
        var dog4 = new Dog();
        System.out.println(dog3.equals(dog4)); // false
        // both are not true

        // after hascode intialization

        System.out.println(dog3.equals(dog4)); // will be true cause both have the same barks

        // lets change barks

        dog3.sound = "bbbb";
        System.out.println(dog3.equals(dog4)); // false
        // cause the barks was changed. both being the same was based on barking so its not eqial anymore.


    }


}
