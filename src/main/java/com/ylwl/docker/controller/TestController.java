package com.ylwl.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String getResult(){
        int a = 1 << 2;
        int b =a+1;
        System.out.println(b);

        return "this is a test data:"+ a;
    }
}
