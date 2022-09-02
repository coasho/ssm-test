package com.waveshare.service;

import com.waveshare.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByCondition(Student student,int startRow);
    int insertStudent(Student student);
    int updateStudent(List<Student> students);
    int deleteStudentByID(String id);
}
