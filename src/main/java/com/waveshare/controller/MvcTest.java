package com.waveshare.controller;

import com.waveshare.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/teacher")
public class MvcTest {
    @RequestMapping(value = "/demo.action",method= RequestMethod.POST)
    public String  demo(){
        System.out.println("小程序1POST请求执行成功");
        return "main";
    }
    @RequestMapping(value = "/demo.action",method = RequestMethod.GET)
    public String demo2(){
        System.out.println("小程序1GET请求执行成功");
        return "main";
    }
    @RequestMapping("/demo1.action")
    public String demo01(String name,int age){
        System.out.println(name+","+age);
        return "main";
    }
    @RequestMapping("/demo2.action")
    public String demo02(Student student){
        System.out.println(student);
        return "main";
    }
    @RequestMapping("/demo3/{name}/{age}.action")
    public String demo03(@PathVariable("name") String uname,@PathVariable("age") int uage){
        System.out.println(uname+","+uage);
        return "main";
    }
    @RequestMapping("/demo4.action")
    public String demo04(@RequestParam("name") String uname,@RequestParam("age") int uage){
        System.out.println(uname+","+uage);
        return "main";
    }
    @RequestMapping("/demo5.action")
    public String demo05(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(name+","+age);
        return "main";
    }
}
