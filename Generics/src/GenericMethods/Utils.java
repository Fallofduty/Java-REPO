package GenericMethods;

import Generics.GenericList;
import Generics.User;

public class Utils {

    public static <T extends  Comparable <T>> T max (T first,T second){
        // in comparable make sure to use extends
        // use extend cause extend will be used for using the interface of comparable.
        // compareable <T> means only t will be comparable with it t not anything else.
      return   first.compareTo(second)<0?second:first; //
    }

    public static <K,V> void print(K key,V value){
        System.out.println(key + "="+value);
        // in here there is two type of paramter K and value
        // k can be string num or boolean anything same for v also.
    }
    public static void printUser(User user){
        System.out.println(user);
    }

    public static void printUsers(GenericList<User> users){

    }
    public static void printUsers_WildCard(GenericList<? extends User> users){ // this casts to  user only. ddddddddddddddd

    }
}
