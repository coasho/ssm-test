package com.waveshare.service.impl;

import com.waveshare.bean.Student;
import com.waveshare.bean.UsualGrade;
import com.waveshare.mapper.student.StudentMapper;
import com.waveshare.service.StudentService;
import com.waveshare.service.UsualGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private UsualGradeService usualGradeService;

    @Override
    public List<Student> getStudentByCondition(Student student, int startRow) {
        return studentMapper.getStudentByCondition(student,startRow);
    }
    @Override
    public int insertStudent(Student student) {
        int i = studentMapper.insertStudent(student);
        int id = Integer.parseInt(student.getId());
        usualGradeService.insertUsualGrade(new UsualGrade(0,10054,id));
        if (i > 0) {
            System.out.println("学生数据插入成功！");
        }
       //System.out.println(1/0);
        return i;
    }

    @Override
    public int updateStudent(List<Student> students) {
        return studentMapper.updateStudent(students);
    }

    @Override
    public int deleteStudentByID(String id) {
        usualGradeService.removeUsualGrade(id);
        return studentMapper.deleteStudentByID(id);
    }
}
