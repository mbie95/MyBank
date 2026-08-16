package com.finance.mybank.exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String error) {
        super(error);
    }
}
