package com.itheima.service.impl;

import com.itheima.dao.EmpDao;
import com.itheima.dao.impl.EmpDaoA;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmpDao empDao=new EmpDaoA();
    @Override
    public List<Emp> EmpList() {
        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp -> {
            //处理gender:1男,2女
            String gender = emp.getGender();
            if (gender.equals("1")){
                emp.setGender("男");
            }else if (gender.equals("2")){
                emp.setGender("女");
            }

            //处理job:1讲师,2班主任,3就业指导
            String job = emp.getJob();
            if (job.equals("1")){
                emp.setJob("讲师");
            } else if (job.equals("2")) {
                emp.setJob("班主任");
            } else if (job.equals("3")) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
