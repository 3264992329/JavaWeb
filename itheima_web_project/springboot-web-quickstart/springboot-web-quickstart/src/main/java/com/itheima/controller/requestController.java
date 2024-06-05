package com.itheima.controller;

import com.itheima.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class requestController {
    /*@RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request){
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);
        System.out.println(name+":"+age);
        return "ok";

    }*/

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String username, Integer age){
        System.out.println(username+":"+age);
        return "ok";
    }

    /*实体参数*/
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    /*数组集合参数*/
    @RequestMapping("/simpleArray")
    public String simpleArray(String[] List){
        System.out.println(Arrays.toString(List));
        return "OK";
    }

    @RequestMapping("/simpleList")
    public String simpleList(@RequestParam List<String> list){
        System.out.println(list);
        return "OK";
    }

    /*日期参数和json参数*/
    @RequestMapping("/dataTime")
    public String dataTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return "OK";
    }

    /*json参数*/
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

}
