package com.shestakov.parkservice.exceptions;

/**
 *  Место уже занято
 */
public class ParkSpaceIsBusyException extends RuntimeException{

//    private static final long serialVersion = 1L;

    public ParkSpaceIsBusyException() {
        super();
    }

    public ParkSpaceIsBusyException(String customMessage){
        super(customMessage);
    }
}
