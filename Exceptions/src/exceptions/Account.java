package exceptions;

public class Account {
    private float balance;
    public void Deposit(float value) throws IllegalAccessException {
        if(value<=0){
            throw new IllegalAccessException(); // defensive programming
        }
    }

    public void withdrawMoney(float value) throws InsuiffcentFundExceptions {
        if(value>balance){
          throw new InsuiffcentFundExceptions();
        }
    }
    public void withdrawMoney2(float value) throws AccountExceptions {
        if(value>balance){

            throw new AccountExceptions(new InsuiffcentFundExceptions());


        }
    }

}
