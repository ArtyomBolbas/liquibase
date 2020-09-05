package com.bolbo.study.liquibase.repository;

import com.bolbo.study.liquibase.model.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
