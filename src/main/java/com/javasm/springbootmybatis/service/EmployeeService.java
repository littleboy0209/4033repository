package com.javasm.springbootmybatis.service;

import com.javasm.springbootmybatis.entity.Employee;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-07-01
 */
public interface EmployeeService  {
    List<Employee> findAll();
}
