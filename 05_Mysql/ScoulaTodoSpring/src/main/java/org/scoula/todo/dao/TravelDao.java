package org.scoula.todo.dao;

import org.scoula.todo.domain.TravelVO;

import java.sql.SQLException;

public interface TravelDao {
    void create(TravelVO travel) throws SQLException;
}
