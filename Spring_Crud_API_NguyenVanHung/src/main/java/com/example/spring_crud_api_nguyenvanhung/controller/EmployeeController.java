package com.example.spring_crud_api_nguyenvanhung.controller;

import com.example.spring_crud_api_nguyenvanhung.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
}