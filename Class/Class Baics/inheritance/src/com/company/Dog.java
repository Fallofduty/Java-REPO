package com.company;

public class  Dog extends Animal {
// extends will get character from animal
    public Dog(String sound) {
        super(sound); // this inherits from dog class
        // super() means it will be following same parameter as sound.
    }
    public Dog(){

    }
    public void age(){
        System.out.println("dog lives for 20 year old");
    }

    @Override
    public void makeSound() {
        System.out.println("wags tale");
    }

    @Override
    void findFood() {
        System.out.println("looks at human ");
        makeSound();
    }

}
