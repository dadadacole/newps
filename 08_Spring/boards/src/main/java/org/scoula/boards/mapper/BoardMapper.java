package org.scoula.boards.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.scoula.boards.domain.BoardVO;

public interface BoardMapper {
    @Select("select * from tbl_board order by no desc")
    public List<BoardVO> getList();
}