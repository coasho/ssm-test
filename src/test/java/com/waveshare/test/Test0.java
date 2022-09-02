package com.waveshare.test;


import com.waveshare.bean.Student;
import com.waveshare.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext_service.xml"})
public class Test0 {
    @Autowired
    StudentService studentService;
    @Test
    public void test00() {
        studentService.getStudentByCondition(new Student(),2).forEach(student -> System.out.println(student));
        //int i = studentService.insertStudent(new Student("213113", "徐凯", "男", "21331231"));
//        int i = studentService.deleteStudentByID("121213190");
//        System.out.println(i);
    }
}
