package com.kshrd.spring_data_jpa.service.impl;

import com.kshrd.spring_data_jpa.model.Employee;
import com.kshrd.spring_data_jpa.model.request.EmployeeRequest;
import com.kshrd.spring_data_jpa.repository.EmployeeRepository;
import com.kshrd.spring_data_jpa.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    // 1. Read: Get all employees
    @Override
    public Page<Employee> getAllEmployees(Integer page, Integer size, String sortBy, boolean desc) {
        Sort sort = desc ? Sort.by("id", "name").descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page-1, size, sort);
        return employeeRepository.findAll(pageable);
    }

    // 2. Read: Get an employee
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // 3. Create: Insert an employee
    @Override
    public Employee createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = Employee.builder()
                .name(employeeRequest.getName())
                .age(employeeRequest.getAge())
                .gender(employeeRequest.getGender())
                .build();

        return employeeRepository.save(employee);
    }

    // 4. Update: Edit an employee
    @Override
    public Employee updateEmployee(Long id, EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        employee.setName(employeeRequest.getName());
        employee.setAge(employeeRequest.getAge());
        employee.setGender(employeeRequest.getGender());

        return employeeRepository.save(employee);
    }

    // 5. Delete: Destroy an employee
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
