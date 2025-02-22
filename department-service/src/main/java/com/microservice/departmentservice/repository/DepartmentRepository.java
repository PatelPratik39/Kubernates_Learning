package com.microservice.departmentservice.repository;

import com.microservice.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DepartmentRepository  {

    List<Department> departments = new ArrayList<>();

    default Department addDepartment(Department department){
        departments.add(department);
        return department;
    }

     default Department findById(Long id){
        return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
    }

    default List<Department> findAll(){
        return departments;
    }
}
