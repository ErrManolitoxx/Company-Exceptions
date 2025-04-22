package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.exception.ApartmentNotFoundException;

import java.util.List;
import java.util.Map;

@Slf4j
@Data
@AllArgsConstructor
public class Company {

    private final String name;
    private final String cif;
    private final Map<Apartment, String> apartmentByName;

    public void showDepartment() {
        for (var department: apartmentByName.values()) {
            log.info(department.toString());
        }
    }

    public List<Employee> getDepartmentEmployees(String departmentName) throws ApartmentNotFoundException {


    }

    public String findApartment(String departmentName) throws ApartmentNotFoundException{
        if (apartmentByName.containsKey(departmentName)) {
            return apartmentByName.get(departmentName);
        } else {
            return new ApartmentNotFoundException(departmentName);
        }
    }
}
