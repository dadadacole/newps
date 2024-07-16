package org.example.jdbc_ex.common;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;
import java.sql.Connection;


public class JDBCUtil {
    static Connection conn = null;

    //정적 초기화
    static {
        try {
            //Properties 객체를 생성하고 application.properties 파일 로드
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            // 프로퍼티 파일에서 드라이버, URL, 사용자 ID, 비밀번호 가져옴
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("id");
            String password = prop.getProperty("password");

            // Mysql 드라이버 로드
            Class.forName(driver);

            //DriverManager를 사용해서 데이터베이스 연결 객체 생성
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            // 예외 발생시 스택 트렝스
            e.printStackTrace();
        }
    }

    //데이터 베이스 연결 객체를 반환하는 메소드
    public static Connection getConnection() {
        return conn;
    }

    // 데이터베이스 연결을 닫는 메소드
    public static void close() {
        try{
            if(conn != null) {
                // 데이터베이스 연결 닫기
                conn.close();
                conn = null;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
