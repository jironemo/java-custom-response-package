package com.jiro.exceptions;

public class NoMessageAvailableException extends RuntimeException {

    public NoMessageAvailableException(){
        super("You need to add a message in your response");
    }
}
