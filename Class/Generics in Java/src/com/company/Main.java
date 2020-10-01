package com.company;

public class Main {
    static class Milk {
        void drink() {
            System.out.println("You drink the milk.");
        }
    }

   static class Oranges {
        void juggle() {
            System.out.println("You drop the oranges on the ground.");
        }
    }

   static class Box<T> { // t is type parameter passing in types c
                         // can be named anything
                         //can be multiple object also
                         
        private T contents;

        void add(T thing) {
            if (contents == null) {
                contents = thing;
            } else {
                System.out.println("The box is full.");
            }
        }

       T remove() {
            if (contents == null) {
                System.out.println("The box is empty.");
                return null;
            } else {
                T thing = contents;
                contents = null;
                return thing;
            }
        }
    }




    public static void main(String[] args) {

        var milk = new Milk();
        var oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        // this way milk cant be casted to oranges and oranges cant be casted to milk.


        debugAdd(milk,boxOfMilk); // => Type: MilkType: OrangesYou drink the milk.
        debugAdd(oranges,boxOfOranges); // => You drop the oranges on the ground.


        // before t casting was needed
        (boxOfMilk.remove()).drink();
        (boxOfOranges.remove()).juggle();

        //after casting
        boxOfMilk.remove().drink(); // => You drink the milk.
        boxOfOranges.remove().juggle(); // => You drop the oranges on the ground.

    }

    static <T> void debugAdd(T item,Box<T> box){

        // adding t item which is the item inside the box
        // box will be the same object has the box cant be opposite
        // if orange is passed box must recive orange type box also
        System.out.printf("Type: %s",item.getClass().getSimpleName()); // will get the class name
        box.add(item);

    }
}
