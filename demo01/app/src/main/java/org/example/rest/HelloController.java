package org.example.rest;

import org.example.rest.annotation.LoginRequired;
import org.example.utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(){
        Integer i = Utils.add(1);
        Integer b = Utils.del(3);
        return "hello,world~" + i + "-" + b;
    }

    @GetMapping("/user")
    @LoginRequired
    public String user(){
        return "用户中心，需要登录";
    }
}