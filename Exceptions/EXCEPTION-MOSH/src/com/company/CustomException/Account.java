package com.company.CustomException;

import java.io.IOException;

public class Account {
    private float balance;

    public void withdraw (float value) throws InsuffecnetfundsException {
          if(value>balance){
              throw new InsuffecnetfundsException();
          }
    }
    public void withdraw2 (float value) throws AccountException {
          if(value>balance){
              throw new AccountException(new InsuffecnetfundsException("moneey ran out ")); // acount exception but it is caused account exception error.
          }
    }

}
