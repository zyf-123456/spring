package com.mashibing.controller.a_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnotationController {
    @RequestMapping("/test03")
    public void  test03(){
        System.out.println("Controller注解 ......");
    }
}
