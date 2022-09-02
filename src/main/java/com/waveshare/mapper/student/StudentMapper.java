package com.waveshare.mapper.student;

import com.waveshare.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudentByCondition(@Param("student") Student student,@Param("startRow") int startRow);
    int insertStudent(Student student);
    int updateStudent(List<Student> students);
    int deleteStudentByID(String id);

}
