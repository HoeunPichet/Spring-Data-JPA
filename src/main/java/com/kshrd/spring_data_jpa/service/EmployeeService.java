package com.kshrd.spring_data_jpa.service;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees(Integer page, Integer size);

    Employee getEmployeeById(Long id);

    Employee createEmployee(EmployeeRequest employeeRequest);

    Employee updateEmployee(Long id, EmployeeRequest employeeRequest);

    void deleteEmployee(Long id);
}
