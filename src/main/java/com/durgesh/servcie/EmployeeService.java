package com.durgesh.servcie;

import com.durgesh.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee update(long id,Employee employee);

    void delete(long id);

    List<Employee> getAllEmployee();


}
