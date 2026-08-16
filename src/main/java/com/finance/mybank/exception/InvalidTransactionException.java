package com.finance.mybank.exception;

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String error) {
        super(error);
    }
}
