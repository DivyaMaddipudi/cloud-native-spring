package org.example.exception;

public class BackAccountNotFoundException extends RuntimeException{
    public BackAccountNotFoundException(String message) {
        super(message);
    }
}
