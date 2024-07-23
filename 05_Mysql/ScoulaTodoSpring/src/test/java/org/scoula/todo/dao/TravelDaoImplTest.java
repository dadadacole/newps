package org.scoula.todo.dao;

import org.junit.jupiter.api.Test;
import org.scoula.todo.domain.TravelImageVO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelDaoImplTest {

    @Test
    void createTravelImages() throws IOException {
        String dir = "D:\\travel-image";
        List<TravelImageVO> files = Files.list(Paths.get(dir))
                .map(Path::toFile)
                .map(TravelImageVO::of)
                .toList();
        for(TravelImageVO file: files) {
            System.out.println(file);
            dao.createImage(file);

        }
}