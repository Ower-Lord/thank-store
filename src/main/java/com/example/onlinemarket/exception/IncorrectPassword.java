package com.example.onlinemarket.exception;


public class IncorrectPassword extends RuntimeException {
    public IncorrectPassword(String message) {
        super(message);
    }
}