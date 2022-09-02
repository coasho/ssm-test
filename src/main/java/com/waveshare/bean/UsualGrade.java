package com.waveshare.bean;

public class UsualGrade {
    private Integer id;
    private Integer currentScore;
    private Integer typeID;

    public UsualGrade() {
    }

    private Integer studentID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "UsualGrade{" +
                "id=" + id +
                ", currentScore=" + currentScore +
                ", typeID=" + typeID +
                '}';
    }

    public UsualGrade(Integer id, Integer currentScore, Integer typeID, Integer studentID) {
        this.id = id;
        this.currentScore = currentScore;
        this.typeID = typeID;
        this.studentID = studentID;
    }

    public UsualGrade(Integer currentScore, Integer typeID, Integer studentID) {
        this.currentScore = currentScore;
        this.typeID = typeID;
        this.studentID = studentID;
    }
}
