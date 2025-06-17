package org.example.demo_fragments;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @Value("${custom}")

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/pageb")
    public String pageB(){
        return "pageb";
    }

}
