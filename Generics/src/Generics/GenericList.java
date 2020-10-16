package Generics;

public class GenericList<T>  implements  Comparable<T>{
    /*
    t is the type parameter for the class

     */
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){ // make sure the parameter is the same
        items[count++]= item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public int compareTo(T points) {
        return 0;
    }


}
