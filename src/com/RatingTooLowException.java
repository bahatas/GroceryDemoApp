package com;


public class RatingTooLowException extends Exception {
    public RatingTooLowException(String errorMessage) {
        super(errorMessage);
    }
}
