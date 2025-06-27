package org.example.exception;

public class DividedByZeroException extends RuntimeException {
    public DividedByZeroException(String message) {
        super(message);
    }
}
