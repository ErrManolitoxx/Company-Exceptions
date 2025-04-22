package org.example.components;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.example.Reader;
import org.example.model.Apartment;

import java.util.Scanner;

@Data
@Log4j
public class ApartmentReader implements Reader<Apartment> {

    private final Scanner scanner= new Scanner(System.in);

    @Override
    public Apartment read() {

        System.out.println("Introduzca la información del departamento: ");

        System.out.println("Nombre: ");
        String name = scanner.nextLine();


    }
}
