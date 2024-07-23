package org.scoula.studentscore.domain;

public class StudentScoreService {
    StudentScores studentScores = StudentScores.getInstance();

    public void initScores(){
        StudentScores studentScores = StudentScores.getInstance();

        init studentNum = Input.getInt("학생수>");
        studentScores.setStudentNum(studentNum);
    }

    public void getScores(){
        Student studentScores = StudentScores.getI
    }
}
