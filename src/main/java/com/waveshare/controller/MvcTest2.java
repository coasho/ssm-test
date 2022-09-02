package com.waveshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/student")
public class MvcTest2 {
    @RequestMapping("/demo.action")
    public String  demo(){
        System.out.println("小程序2执行成功");
        return "main";
    }
}
