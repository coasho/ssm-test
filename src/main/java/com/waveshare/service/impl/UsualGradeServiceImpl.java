package com.waveshare.service.impl;

import com.waveshare.bean.UsualGrade;
import com.waveshare.mapper.usualgrade.UsualGradeMapper;
import com.waveshare.service.UsualGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsualGradeServiceImpl implements UsualGradeService {
    @Autowired
    private UsualGradeMapper usualGradeMapper;
    @Override
    public int insertUsualGrade(UsualGrade usualGrade) {
        int i = usualGradeMapper.insertUsualGrade(usualGrade);
        if(i>0){
            System.out.println("成绩信息插入成功！");
        }
        return i;
    }

    @Override
    public int removeUsualGrade(String studentID) {
        return usualGradeMapper.removeUsualGradeByStudentID(studentID);
    }
}
