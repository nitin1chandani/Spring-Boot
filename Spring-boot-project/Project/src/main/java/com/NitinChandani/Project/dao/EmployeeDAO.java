package com.NitinChandani.Project.dao;
import com.NitinChandani.Project.entity.Employee;
import java.util.List;
public interface EmployeeDAO {

    // find all
    List<Employee> findAll();

    //find by id
    Employee findById(int theId);

    // add new employee
    Employee save(Employee theEmployee);

    // delete an employee by id
    void deleteById(int theId);

}
