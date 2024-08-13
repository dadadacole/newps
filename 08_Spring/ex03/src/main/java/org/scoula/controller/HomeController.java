package org.scoula.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//@Slf4j:Lombok 제공, log() 라는 멤버 변수가 생긴다
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("name", "홍길동");

        return "index";
    }
}