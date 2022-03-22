package com.shestakov.parkservice.exceptions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ClientNotFoundException extends RuntimeException{
    private static final long serialVersion = 1L;

    public ClientNotFoundException() {
        super();
    }

    public ClientNotFoundException(String customMessage){
        super(customMessage);
    }
}
