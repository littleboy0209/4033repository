package com.javasm.springbootmybatis.mapper;

import com.javasm.springbootmybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-07-01
 */
//@Mapper
public interface EmployeeMapper{

    List<Employee> findAll();

}
