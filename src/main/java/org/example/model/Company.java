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
    private final Map<Apartment, String> apartmentStringMap;

    public void showDepartment() {
        for (var department: apartmentStringMap.values()) {
            log.info(department.toString());
        }
    }

    public List<Employee> getDepartmentEmployees(String departmentName) throws ApartmentNotFoundException {
        return
    }

    public Apartment findApartment(String name) throws ApartmentNotFoundException{
        if (apartmentStringMap.containsKey(name)) {
            return apartmentStringMap.get(name);
        } else {
            return new ApartmentNotFoundException(name);
        }
    }
}
