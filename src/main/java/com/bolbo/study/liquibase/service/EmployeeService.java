package com.bolbo.study.liquibase.service;

import com.bolbo.study.liquibase.model.jpa.Employee;
import com.bolbo.study.liquibase.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee populateEmployee() {
        Employee employee = new Employee("Vasya", 25);
        return employeeRepository.save(employee);
    }
}
