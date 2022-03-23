package com.shestakov.parkservice.exceptions;

/**
 * Место уже пустое
 */
public class ParkSpaceIsEmptyException extends RuntimeException{

//    private static final long serialVersion = 1L;

    public ParkSpaceIsEmptyException() {super();}

    public ParkSpaceIsEmptyException(String customMessage){
        super(customMessage);
    }
}
