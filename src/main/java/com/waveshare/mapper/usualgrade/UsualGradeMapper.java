package com.waveshare.mapper.usualgrade;

import com.waveshare.bean.UsualGrade;

import java.util.List;

public interface UsualGradeMapper {
    List<UsualGrade> getUsualGradeListByStudentID(String studentId);
    int insertUsualGrade(UsualGrade usualGrade);
    int removeUsualGradeByStudentID(String studentId);
}
