package com.pe.relari.people.util;

import com.pe.relari.people.model.domain.Employee;
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
}
