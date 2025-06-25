package org.example.exo2_rest.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GeneralExceptionHandler extends RuntimeException {
    public GeneralExceptionHandler(String message) {
        super(message);
    }

    @ExceptionHandler(NotFound)
}
