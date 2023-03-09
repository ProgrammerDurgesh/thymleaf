package com.durgesh.serviceImpl;

import com.durgesh.model.Employee;
import com.durgesh.repo.EmployeeRepo;
import com.durgesh.servcie.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeImpl implements EmployeeService {


    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee update(long id,Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void  delete(long id) {
         employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }
}
