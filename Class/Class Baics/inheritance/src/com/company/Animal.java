package com.company;

import java.util.Objects;

public abstract class Animal { // animals cant not be intaiated
   public String sound;
    public Animal(String sound){
        this.sound = sound;
    }
    public Animal(){

    }
    public void makeSound(){
        System.out.println(sound);
    }
    @Override // this will over write the toString method not nedded but good to have it.
    public String toString(){
       return getClass().getSimpleName() + " : Sound =" + sound;
    }

    abstract void findFood(); // has no body here.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}
