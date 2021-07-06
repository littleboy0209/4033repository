package com.javasm.springbootmybatis.controller;


import com.javasm.springbootmybatis.entity.Employee;
import com.javasm.springbootmybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-07-01
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("findAll")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


}
