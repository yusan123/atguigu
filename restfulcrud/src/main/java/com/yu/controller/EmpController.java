package com.yu.controller;

import com.yu.dao.DepartmentDao;
import com.yu.dao.EmployeeDao;
import com.yu.entities.Department;
import com.yu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/30 22:52.
 */
@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;
    //查询所有员工
    @GetMapping("/emps")
    public String getEmpList(Model model){
        Collection<Employee> allEmp = employeeDao.getAll();
        model.addAttribute("emps",allEmp);
        return "emp/list";

    }

    //去添加员工的页面
    @GetMapping("/emp")
    public String toAddEmp(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        return "emp/add";
    }


}
