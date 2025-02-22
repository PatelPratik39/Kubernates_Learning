package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.model.Department;
import com.microservice.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department add(@RequestBody Department department){
        LOGGER.info("Adding Department {}", department);
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        LOGGER.info("Finding All Departments");
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable  Long id){
        LOGGER.info("Finding Department with id {}", id);
        return departmentRepository.findById(id);
    }


}