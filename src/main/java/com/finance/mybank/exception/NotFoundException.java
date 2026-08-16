package com.finance.mybank.exception;

public class NotFoundException  extends RuntimeException {
    public NotFoundException(String error) {
        super(error);
    }
}
