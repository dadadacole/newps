package org.scoula;


import lombok.Data;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data

public class Restaurant {
    @Autowired
    private Chef chef;

}


