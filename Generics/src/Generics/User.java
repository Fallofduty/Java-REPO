package Generics;

public class User implements Comparable<User> {
// make sure type is always done like this <User>
    // this creates the type constraints.
    // so only one thing works
    // only cab compare user with users.
    // remeber to use implemehts with inerfaces
    // extends for inhertiance
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User user) {
       return points-user.points;
       /*
       points will be the current object
       and user.points will be the user that is being compared
        */
    }

    @Override
    public String toString() {
        return "points="+points;
    }
}
