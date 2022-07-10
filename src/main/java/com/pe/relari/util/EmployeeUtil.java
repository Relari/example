package com.pe.relari.util;

import com.pe.relari.model.Employee;

import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class EmployeeUtils.
 * @author Relari
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeUtil {

    public static Object [] rowEmployee(Employee employee) {
        return new Object[] {
                employee.getId(),
                employee.getFirstName(),
                employee.getSex(),
                employee.getIsActive()
        };
    }

    public static String getSexCode(String sexDescription) {
        return Map.of(
                "Male", "M",
                "Female","F"
        ).get(sexDescription);
    }
}
