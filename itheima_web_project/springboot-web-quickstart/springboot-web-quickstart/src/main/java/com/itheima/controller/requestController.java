package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

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

    /*@RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String username, Integer age){
        System.out.println(username+":"+age);
        return "ok";
    }

    *//*实体参数*//*
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    *//*数组集合参数*//*
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

    *//*日期参数和json参数*//*
    @RequestMapping("/dataTime")
    public String dataTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return "OK";
    }

    *//*json参数*//*
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    *//*路径参数*//*
    @RequestMapping("/{sum}")
    public String pathParam(@PathVariable Integer sum){
        System.out.println(sum);
        return "OK";
    }

    @RequestMapping("/{sum}/{name}")
    public String pathsParam(@PathVariable Integer sum,@PathVariable String name){
        System.out.println(sum);
        System.out.println(name);
        return "OK";
    }*/

    @RequestMapping("/simpleParam")
    public Result simpleParam(@RequestParam(name="name",required = false) String username, Integer age){
        System.out.println(username+":"+age);
        return Result.success(username+":"+age);
    }

    /*实体参数*/
    @RequestMapping("/simplePojo")
    public Result simplePojo(User user){
        System.out.println(user);
        return Result.success(user);
    }

    /*数组集合参数*/
    @RequestMapping("/simpleArray")
    public Result simpleArray(String[] List){
        System.out.println(Arrays.toString(List));
        return Result.success(List);
    }

    @RequestMapping("/simpleList")
    public Result simpleList(@RequestParam List<String> list){
        System.out.println(list);
        return Result.success(list);
    }

    /*日期参数和json参数*/
    @RequestMapping("/dataTime")
    public Result dataTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return Result.success(time);
    }

    /*json参数*/
    @RequestMapping("/jsonParam")
    public Result jsonParam(@RequestBody User user){
        System.out.println(user);
        return Result.success(user);
    }

    /*路径参数*/
    @RequestMapping("/{sum}")
    public Result pathParam(@PathVariable Integer sum){
        System.out.println(sum);
        return Result.success(sum);
    }

    @RequestMapping("/{sum}/{name}")
    public Result pathsParam(@PathVariable Integer sum,@PathVariable String name){
        System.out.println(sum);
        System.out.println(name);
        return Result.success(sum+"  "+name);
    }

}
