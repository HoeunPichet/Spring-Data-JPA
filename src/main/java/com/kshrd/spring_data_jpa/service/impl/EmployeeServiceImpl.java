package com.kshrd.spring_data_jpa.service.impl;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;
import com.kshrd.spring_data_jpa.repository.EmployeeRepository;
import com.kshrd.spring_data_jpa.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(Integer page, Integer size) {
        return List.of();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee createEmployee(EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
