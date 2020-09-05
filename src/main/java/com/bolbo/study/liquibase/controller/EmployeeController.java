package com.bolbo.study.liquibase.controller;

import com.bolbo.study.liquibase.model.jpa.Employee;
import com.bolbo.study.liquibase.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value="/")
    public ResponseEntity<Employee> populateEmployee() {
        Employee employee = employeeService.populateEmployee();
        return ResponseEntity.ok().body(employee);
    }

}
