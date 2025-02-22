package com.microservice.employeeservice.repository;

import com.microservice.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {

    private  List<Employee> employees = new ArrayList<>();

    public Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public List<Employee> getAll() {
        return employees;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(a -> a.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findByDepartmentId(Long departmentId) {
        return  employees.stream()
                .filter(a -> a.departmentId().equals(departmentId))
                .toList();
    }

}