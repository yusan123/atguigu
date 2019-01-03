package com.yu.controller;

import com.yu.dao.DepartmentDao;
import com.yu.dao.EmployeeDao;
import com.yu.entities.Department;
import com.yu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        return "add";
    }

    //处理添加员工的请求
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //跳转到修改页面
    @GetMapping("/emp1/{id}")
    public String toEditPage(@PathVariable Integer id, Model model,
                             HttpServletRequest req,
                             HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = employeeDao.get(id);

        model.addAttribute("emp",employee);
        //return "forward:/emp";  //这样重定向，不能有效加载静态文件 http://localhost:8080/crud/emp/asserts/js/popper.min.js
        //return "redirect:/emp";

        //使用原生api请求转发
        //req.setAttribute("emp",employee);
        //req.getRequestDispatcher("/emp").forward(req,resp); //也是不能正常加载静态文件
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        return "add";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable Integer id){
        employeeDao.delete(id);
        return "redirect:emps";
    }

}
