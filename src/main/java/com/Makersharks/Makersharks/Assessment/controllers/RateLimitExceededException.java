package com.Makersharks.Makersharks.Assessment.controllers;


public class RateLimitExceededException extends RuntimeException {
    public RateLimitExceededException(String message) {
        super(message);
    }
}
