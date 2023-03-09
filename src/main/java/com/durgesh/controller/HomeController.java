package com.durgesh.controller;

import com.durgesh.model.Employee;
import com.durgesh.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private EmployeeRepo employeeREpo;
    @GetMapping("/home")
    public String home()
    {
        return "index";
    }

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody Employee employee)
    {
       // employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
        return new ResponseEntity<>(employeeREpo.save(employee),HttpStatus.CREATED);
    }
    @GetMapping("/get-All")
    public ResponseEntity<?> getAllUser()
    {
        return  new ResponseEntity<>(employeeREpo.findAll(), HttpStatus.OK);
    }
}
