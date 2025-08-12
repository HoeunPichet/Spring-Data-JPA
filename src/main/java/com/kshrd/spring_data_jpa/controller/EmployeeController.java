package com.kshrd.spring_data_jpa.controller;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;
import com.kshrd.spring_data_jpa.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    List<Employee> getAllEmployees(Integer page, Integer size) {
        return null;
    }

    @GetMapping("/{id}")
    Employee getEmployeeById(Long id) {
        return null;
    }

    @PostMapping
    Employee createEmployee(EmployeeRequest employeeRequest) {
        return null;
    }

    @PutMapping("/{id}")
    Employee updateEmployee(@PathVariable Long id, EmployeeRequest employeeRequest) {
        return null;
    }

    @DeleteMapping("/{id}")
    String deleteEmployee(Long id) {
        return null;
    }
}
