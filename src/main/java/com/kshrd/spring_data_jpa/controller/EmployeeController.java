package com.kshrd.spring_data_jpa.controller;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;
import com.kshrd.spring_data_jpa.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    Page<Employee> getAllEmployees(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "5") Integer size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "false") Boolean desc
    ) {
        return employeeService.getAllEmployees(page, size, sortBy, desc);
    }

    @GetMapping("/{id}")
    Employee getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    Employee createEmployee(EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }

    @PutMapping("/{id}")
    Employee updateEmployee(@PathVariable Long id, EmployeeRequest employeeRequest) {
        return employeeService.updateEmployee(id, employeeRequest);
    }

    @DeleteMapping("/{id}")
    String deleteEmployee(Long id) {
        employeeService.deleteEmployee(id);
        return "Delete successfully";
    }
}
