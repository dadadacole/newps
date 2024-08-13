package org.scoula;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assertNotNull;




@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
class RestaurantTest {

    @Autowired
    private Restaurant restaurant;

    @Test
    void getChef() {
        assertNotNull(restaurant);
        log.info(restaurant);
        log.info("----------------------");
        log.info(restaurant.getChef());
    }
}

INFO : org.scoula.RestaurantTest - Restaurant(chef=org.scoula.Chef@25230246)
INFO : org.scoula.RestaurantTest - ----------------------------------
INFO : org.scoula.RestaurantTest - org.scoula.Chef@25230246


