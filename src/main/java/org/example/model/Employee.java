package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private final String nif;
    private final String name;
    private final String surname;
    private final String job;
}
