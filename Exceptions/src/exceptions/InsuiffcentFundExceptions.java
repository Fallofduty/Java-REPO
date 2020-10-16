package exceptions;

public class InsuiffcentFundExceptions extends Exception {
    public InsuiffcentFundExceptions(String message) {
        super(message);
    }

    public InsuiffcentFundExceptions() {
        System.out.println("not enough money in the bank");
    }
}
