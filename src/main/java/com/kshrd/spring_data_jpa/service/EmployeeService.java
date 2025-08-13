package com.kshrd.spring_data_jpa.service;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    Page<Employee> getAllEmployees(Integer page, Integer size, String sortBy, boolean desc);

    Employee getEmployeeById(Long id);

    Employee createEmployee(EmployeeRequest employeeRequest);

    Employee updateEmployee(Long id, EmployeeRequest employeeRequest);

    void deleteEmployee(Long id);
}
