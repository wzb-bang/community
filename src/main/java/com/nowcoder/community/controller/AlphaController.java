package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bo
 * @date Created in 14:03 2020/2/29
 * @description
 **/
@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @RequestMapping("/hello")
    @ResponseBody
    public String  sayHello(){
        return  "Hello Spring ";
    }

    @RequestMapping("http")
    public void http(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> enumeration = request.getHeaderNames();
        while(enumeration.hasMoreElements()){
            String name=enumeration.nextElement();
            String value=request.getHeader(name);
            System.out.println(name+" : "+value);
        }
        System.out.println(request.getParameter("code"));
        //返回响应数据
        response.setContentType("text/html;charset=utf-8");
        try( PrintWriter writer = response.getWriter()){
            writer.write("<h1>牛客网</h1>");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @RequestMapping(path="/students",method = RequestMethod.GET)
    @ResponseBody
    public String getStudents(
            @RequestParam(name="current",required = false,defaultValue = "1")int current,
            @RequestParam(name="limit",required = false,defaultValue = "10")int limit
    ){
        System.out.println(current);
        System.out.println(limit);
        return "some students";
    }

    @RequestMapping(path="/student",method = RequestMethod.POST)
    @ResponseBody
    public String saveStudent(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    //响应HTML数据
    @RequestMapping(path="/teacher",method = RequestMethod.GET)
    public ModelAndView getTeacher(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","张三");
        modelAndView.addObject("age",30);
        modelAndView.setViewName("/demo/view");
        return modelAndView;
    }

    @RequestMapping(path="/school",method = RequestMethod.GET)
    public String getSchool(Model model){
        model.addAttribute("name","北京大学");
        model.addAttribute("age",100);
        return "demo/view";
    }
    //响应JSON数据 (异步请求)
    //Java对象-> Json字符串 ->JS对象
    @RequestMapping(path="/emp",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getEmp(){
        Map<String,Object> emp=new HashMap<>();
        emp.put("name","张三");
        emp.put("age",23);
        emp.put("salary",8000.0);
        return emp;
    }


}
