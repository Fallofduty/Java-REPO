package com.company.CustomException;

public class InsuffecnetfundsException extends Exception {
    // checked -- will be exception
    // if its unchecked run time wuill be tun time exception.


    public InsuffecnetfundsException() {
        super("not enough momey"); // this is passed as default.
    }

    public InsuffecnetfundsException(String message) {
        super(message);
    }
}
