package org.scoula.todo.dao;

import org.scoula.todo.domain.TravelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class TravelDaoImpl implements TravelDao {
    @Autowired
    Connection conn;

    @Override
    public void create(TravelVO travel) throws SQLException {
        String sql = "insert into travel values(?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement
                (sql)) {
            ps.setInt(1, travel.getNo());
            ps.setString(2, travel.getDistrict());
            ps.setString(3, travel.getTitle());
            ps.setString(4, travel.getDescription());
            ps.setString(5, travel.getAddress());
            ps.setString(6, travel.getPhone());
            ps.executeUpdate();

            @Override
            void createImage (TravelImageVO image) throws SQLException;
            String sql = "insert into travel_image(travel_no, file_name, path, size) values(?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, travel.getNo());
                ps.setString(2, travel.getFileName());
                ps.setString(3, travel.getPath());
                ps.setLong(4, travel.getSize());
                ps.executeUpdate();
            }
        }

    }
}




