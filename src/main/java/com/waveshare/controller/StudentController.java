package com.waveshare.controller;

import com.waveshare.bean.Student;
import com.waveshare.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @ResponseBody
    @RequestMapping("/getlist")
    public List<Student> getStudentListByCondition(@RequestParam("id") String id,
                                                   @RequestParam("gender") String gender,
                                                   @RequestParam("startRow") Integer startRow){
        Student student = new Student(id, null, gender, null);
        if (startRow==null){
            startRow=0;
        }
        startRow=(startRow-1)*8;
        System.out.println("后端执行");
        return studentService.getStudentByCondition(student, startRow);
    }
}
