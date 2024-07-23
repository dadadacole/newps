package org.scoula.studentscore;


import org.scoula.studentscore.lib.cli.App;
import org.scoula.studentscore.lib.cli.ui.Menu;
import org.scoula.studentscore.lib.cli.ui.MenuItem;
import org.scoula.studentscore.service.StudentScoreService;

public class StudentScoreApp extends App {
    // 서비스 클래스 내에 메뉴 관련 메소드들을 모두 넣고 서비스 객체 생성
    StudentScoreService service = new StudentScoreService();
    @Override
    public void createMenu(Menu menu) {
//        메소드 참조로 서비스 객체 내에 있는 메소드 참조
        super.createMenu(menu);
        menu.add( new MenuItem("학생수", service::initScores));
        menu.add( new MenuItem("점수입력", service::getScores));
        menu.add( new MenuItem("점수리스트", service::printScores));
        menu.add( new MenuItem("분석", service::analize));
    }

    public static void main(final String[] args) {
        App app = new StudentScoreApp();
        app.run();
    }
}