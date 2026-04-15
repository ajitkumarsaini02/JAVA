package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // For UI
    public void addEmployee(Employee emp) {
        repo.save(emp);
    }

    // For REST
    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}