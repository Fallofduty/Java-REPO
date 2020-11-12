package com.company.generics_1;

public class User implements Comparable<User> {
    // becuase of constraints it will be comparabklle to sers,.

private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User user) {
        return points - user.points;
    }

    @Override
    public String toString() {
       return "poibts="+points;
    }
}
/*

public class User implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
in here there was no type constinstrats as a reusklt when it will be compared it will be compared with objects
 */
