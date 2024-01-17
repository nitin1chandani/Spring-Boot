package com.NitinChandani.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.NitinChandani.Project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write any code
}
