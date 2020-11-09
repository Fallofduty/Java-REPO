package com.company.CustomException;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause); // this passes a throwable
    }
}
