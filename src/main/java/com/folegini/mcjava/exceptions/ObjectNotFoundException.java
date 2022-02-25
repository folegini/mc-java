package com.folegini.mcjava.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -1121028866261116561L;

    public ObjectNotFoundException(String exception){
        super(exception);
    }

    public ObjectNotFoundException(String exception, Throwable cause){
        super(exception, cause);
    }
}
