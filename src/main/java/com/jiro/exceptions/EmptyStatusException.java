package com.jiro.exceptions;

public class EmptyStatusException extends RuntimeException{
    public EmptyStatusException(){
           super("Status is Empty");
       }

}
