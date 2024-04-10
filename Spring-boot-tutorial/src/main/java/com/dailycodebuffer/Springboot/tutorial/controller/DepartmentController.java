package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentservice;
    private Long departmentId;
    private DepartmentController name;
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department)
    {
        return departmentservice.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentservice.fetchDepartmentList();

    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentbyId(@PathVariable("id") Long departmentId) {
        return departmentservice.fetchDepartmentbyId(departmentId);
}

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentbyName(@PathVariable("name") String departmentName) {
        return departmentservice.fetchDepartmentbyId(departmentName);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentservice.deleteDepartmentById(departmentId);
        return "Department deleted Successfully!!";
    }

        @PutMapping("/departments/{id}")
                public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
            return departmentservice.updateDepartment(departmentId,department);
        }

}