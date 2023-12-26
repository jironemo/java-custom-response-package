package com.jiro.exceptions;

public class ResponseTypeMismatchException extends Exception{

    public ResponseTypeMismatchException(){
        super("Response types do not match");
    }
}
