package org.example.exception;

public class ApartmentNotFoundException extends Exception{

    private final String apartmentName;


    public ApartmentNotFoundException(String apartmentName) {
        this.apartmentName = apartmentName;
    }
}
