package com.Li.service;

import com.Li.pojo.Employee;

import java.util.List;


//员工Service层接口
public interface EmployeeService {

    //查询所有员工
    List<Employee> FindEmp();

    //根据员工账号删除员工
    Boolean DelbyEmpAccount(Integer employeeAccount);

    //添加新员工
    Boolean addEmployee(Employee employee);

    //根据员工账号修改信息
    Boolean modifyEmpInfo(Employee employee);

    //根据员工账号查询员工
    List<Employee> FindEmpbyAccount(Integer employeeAccount);

    //查询员工数
    Integer EmpTotal();

    //查询所有教练
    List<Employee> FindCoach();

}
