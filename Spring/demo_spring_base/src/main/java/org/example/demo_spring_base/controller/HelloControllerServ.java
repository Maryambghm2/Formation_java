package org.example.demo_spring_base.controller;

import org.example.demo_spring_base.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerServ {
    private GreetingService greetingService;

    @Autowired
    //public HelloControllerServ(@Qualifier("salutation") GreetingService greetingService){
    public HelloControllerServ( GreetingService greetingService){
        this.greetingService = greetingService;
    }


    @RequestMapping("hello-set")
    public String sayHellot() {
        System.out.println(greetingService.greet());
        return "hello";
    }
}
