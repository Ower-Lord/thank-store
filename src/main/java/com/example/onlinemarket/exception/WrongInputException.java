package com.example.onlinemarket.exception;

public class WrongInputException extends RuntimeException {
    public WrongInputException(String msg) {
        super(msg);
    }
}
