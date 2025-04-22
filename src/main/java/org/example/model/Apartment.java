package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Apartment {

    private final String name;
    private final List<Employee> employees;
}
