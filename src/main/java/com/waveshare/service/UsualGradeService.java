package com.waveshare.service;

import com.waveshare.bean.UsualGrade;

public interface UsualGradeService {
    int insertUsualGrade(UsualGrade usualGrade);
    int removeUsualGrade(String studentID);
}
