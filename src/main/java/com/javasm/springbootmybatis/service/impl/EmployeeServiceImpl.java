package com.javasm.springbootmybatis.service.impl;

import com.javasm.springbootmybatis.entity.Employee;
import com.javasm.springbootmybatis.mapper.EmployeeMapper;
import com.javasm.springbootmybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-01
 */
@Service
@Transactional //添加事务注解
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
