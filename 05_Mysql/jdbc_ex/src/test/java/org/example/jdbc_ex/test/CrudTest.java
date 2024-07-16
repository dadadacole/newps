package org.example.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.example.jdbc_ex.common.JDBCUtil;

import java.sql.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CrudTest {
    Connection conn = JDBCUtil.getConnection();
    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("새로운 user를 등록한다.")
    @Order(1)
    public void insertUser() throws SQLException {
        String sql = "insert into users(id, password, name, role) values(?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "scoula");
            pstmt.setString(2, "scoula3");
            pstmt.setString(3, "스콜라");
            pstmt.setString(4, "USER");
            //SQL 쿼리 실행 및 삽입된 행의 수를 반환
            // INSERT, UPDATE, DELETE 문은 EXECUTEUPDATE를 사용하여 RETURN 값은 INT다
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    @Test
    @DisplayName("user 목록을 추출한다.")
    @Order(2)
    public void selectUser() throws SQLException {
        String sql ="select * from users";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }
    }

    @Test @DisplayName("특정 user 검색한다.")
    @Order(3)
    public void selectUserById() throws SQLException
    {

        //검색할 사용자 ID
        String userid = "scoula";
        // 특정 사용자 정보를 조회하는 SQL 쿼리
        String sql ="select * from users where id = ?";
        try(PreparedStatement stmt = conn.prepareStatement
                (sql)){
            stmt.setString(1, userid);
            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    System.out.println
                            (rs.getString("name"));
                } else {
                    //사용자가 존재하지 않으면 예외를 발생시킴
                    throw new SQLException("scoula not found");
                }
            }
        }
    }

    @Test
    @DisplayName("특정 user 수정한다.")
    @Order(4)
    public void updateUser() throws SQLException {
        // 수정할 사용자 ID
        String userid = "scoula";
        String sql ="update users set name= ? where id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            //SQL 쿼리의 매개변수 설정
            stmt.setString(1, "스콜라 수정");
            stmt.setString(2, userid);
            int count = stmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    @Test
    @DisplayName("지정한 사용자를 삭제한다.")
    @Order(5)
    public void deleteUser() throws SQLException {
        String userid = "scoula";
        String sql ="delete from users where id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, userid);
            int count = stmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }
}




