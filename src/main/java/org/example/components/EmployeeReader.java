package org.example.components;


import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.example.Reader;
import org.example.model.Employee;

import java.util.Scanner;

@Data
@Log4j
public class EmployeeReader implements Reader<Employee> {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Employee read() {

        System.out.println("Introduzca los datos del empleado: ");

        System.out.println("NIF del empleado: ");
        String nif = scanner.nextLine();

        System.out.println("Nombre: ");
        String name = scanner.nextLine();

        System.out.println("Apellidos: ");
        String surname = scanner.nextLine();

        System.out.println("Puesto de trabajo: ");
        String job = scanner.nextLine();

        return new Employee(nif, name, surname, job);
    }
}
