package com.shestakov.parkservice.exceptions;

/**
 * Место не найдено
 */
public class ParkSpaceNotFoundException extends RuntimeException{

//    private static final long serialVersion = 1L;

    public ParkSpaceNotFoundException() {super();}

    public ParkSpaceNotFoundException(String customMessage){
        super(customMessage);
    }
}
