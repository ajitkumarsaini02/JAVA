package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee emp) {
        emp.setId(id);
        return service.save(emp);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Employee delete successfully";
    }
}