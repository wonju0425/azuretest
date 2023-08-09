package com.example.azuretest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String Hello() {
        System.out.println("ㅎㅇ");
        return "boards/hello";
    }
}
