package com.example.onlinemarket.exception;

public class DataAlreadyExistsException extends RuntimeException{
    public DataAlreadyExistsException(String formatted) {
        super(formatted);
    }
}
