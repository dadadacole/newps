package org.scoula.boards.mapper;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.boards.config.RootConfig;
import org.scoula.boards.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j

public class BoardMapperTest {

    @Autowired
    private BoardMapper mapper;

    @Test
    @DisplayName("BoardMapper의 목록 불러오기")
            public void getList() {
            for(BoardVO board : mapper.getList()) {
                log.info(board);
            }
    }
}