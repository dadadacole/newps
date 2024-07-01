package CLI.V6.V3.command;

import CLI.V6.V3.Input;
import CLI.V6.V3.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생 수> ");
        studentScores.setStudentNum(studentNum);
    }
}
