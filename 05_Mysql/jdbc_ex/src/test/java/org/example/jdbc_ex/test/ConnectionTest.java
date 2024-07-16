package org.example.jdbc_ex.test;

import org.example.jdbc_ex.common.JDBCUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class ConnectionTest {
    @Test
    @DisplayName("jdbc_ex 데이터베이스에 접속한다")
    public void testConnection() throws ClassNotFoundException, SQLException{
        //MySql JDBC 드라이버를 로드함
        Class.forName("com.mysql.cj.jdbc.Driver");

        //데이터베이스 연결을 위해 Url, 사용자 ID, 비밀번호 설정
        String url = "jdbc:mysql://localhost:3306/jdbc_ex";
        String id = "jdbc_ex";
        String password = "jdbc_ex";

        //DriverManager 를 사용해서 데이터베이스 연결 객체를 생성
        Connection conn = DriverManager.getConnection(url, id, password);

        // 연결 성공 메시지 출력
        System.out.println("DB 연결 성공");

        // 데이터베이스 연결 종료
        conn.close();


            }

    @Test
    @DisplayName("jdbc_ex에 접속한다(자동닫기)")
    public void testConnection2() throws SQLException{
        try(Connection conn = JDBCUtil.getConnection()){
            System.out.println("DB 연결 성공");

    }
    }

    }