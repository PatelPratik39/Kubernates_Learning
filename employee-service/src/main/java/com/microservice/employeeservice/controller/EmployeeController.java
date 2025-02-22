package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.model.Employee;
import com.microservice.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        LOGGER.info("Employee add: {}", employee);
        return employeeRepository.add(employee);
    }
    @GetMapping
    public List<Employee> getAll() {
        LOGGER.info("Employee getAll");
        return employeeRepository.getAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        LOGGER.info("Employee findById: {}", id);
        return employeeRepository.findById(id);
    }

//    Find an employee using Department Id
    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId")  Long departmentId) {
        LOGGER.info("Employee findByDepartmentId: {}", departmentId);
        return employeeRepository.findByDepartment(departmentId);
    }


}