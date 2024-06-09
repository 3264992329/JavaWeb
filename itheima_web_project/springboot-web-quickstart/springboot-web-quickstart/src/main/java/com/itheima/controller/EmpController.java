package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import com.itheima.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpService empService= new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> empList = empService.EmpList();
        //响应数据
        return Result.success(empList);
    }

}
