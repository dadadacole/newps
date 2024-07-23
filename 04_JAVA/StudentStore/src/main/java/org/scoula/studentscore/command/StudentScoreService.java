package org.scoula.studentscore.command;

public class StudentScoreService {
    StudentScores studentScores = StudentScores.getInstance();

    public void initScores(){
        StudentScores studentScores = StudentScores.getInstance();

        int studentNum = Input.getInt("학생수>");
        studentScores
    }
}
