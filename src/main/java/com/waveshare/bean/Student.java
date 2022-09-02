package com.waveshare.bean;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String gender;
    private String phoneNum;
    private List<UsualGrade> usualGrades;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", usualGrades=" + usualGrades +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<UsualGrade> getUsualGrades() {
        return usualGrades;
    }

    public void setUsualGrades(List<UsualGrade> usualGrades) {
        this.usualGrades = usualGrades;
    }

    public Student(String id, String name, String gender, String phoneNum) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public Student(String name, String gender, String phoneNum) {
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public Student() {
    }
}
