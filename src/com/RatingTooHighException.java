package com;


public class RatingTooHighException extends Exception {
    public RatingTooHighException(String errorMessage) {
        super(errorMessage);
    }
}
