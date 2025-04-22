package org.example.components;

import lombok.AllArgsConstructor;
import org.example.Reader;
import org.example.model.Company;

import java.util.Scanner;

@AllArgsConstructor
public class CompanyApp {
    private final Scanner scanner;
    private final Reader<Company> companyReader;
}
