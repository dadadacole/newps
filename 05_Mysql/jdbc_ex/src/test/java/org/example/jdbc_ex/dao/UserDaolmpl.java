//package org.example.jdbc_ex.dao;
//
//
//import org.scoula.jdbc_ex.common.JDBCUtil;
//import org.scoula.jdbc_ex.domain.UserVO;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class UserDaolmpl implements UserDao {
//    Connection conn = JDBCUtil.getConnection();
//
//    //USERS 테이블 관련 SQL 명령어
//    private String USER_LIST = "select * from users";
//    private String USER_GET = "select * from users where id = ?";
//    private String USER_INSERT = "insert into users values(?,?,?,?)";
//    private String USER_UPDATE = "update users set username = ? where id = ?";
//    private String USER_DELETE = "delete from users where id = ?";
//
//    //회원 등록
//    @Override
//    public int create(UserVO user) throws SQLException{
//        try(PreparedStatement pstmt = conn.prepareStatement(USER_INSERT)){
//            stmt.setString(1,user.getId());
//            stmt.setString(2,user.getPassword());
//            stmt.setString(3,user.getName());
//            stmt.setString(4,user.getRole());
//            return stmt.executeUpdate();
//        }
//    }
//
//    private UserVO map(ResultSet rs) throws SQLException{
//    UserVO user = new UserVO();
//    user.setId(rs.getString("ID"));
//    user.setPassword(rs.getString("PASSWORD"));
//    user.setName(rs.getString("NAME"));
//    user.setRole(rs.getString("ROLE"));
//    return user;
//    }
//
//    // 회원 목록 조회
//    @Override
//    public List<UserVO> getList() throws SQLException{
//        List<UserVO> userList = new ArrayList<UserVO>();
//        Connection conn = JDBCUtil.getConnection();
//        try(PreparedStatement stmt = conn.prepareStatement(USER_LIST);
//            ResultSet rs
//
//
//
//
//
//    }
//
//
//
//}