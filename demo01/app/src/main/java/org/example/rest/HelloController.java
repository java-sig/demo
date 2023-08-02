package org.example.rest;

import org.example.dto.UserRes;
import org.example.rest.annotation.LoginRequired;
import org.example.utils.Utils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(){
        Integer i = Utils.add(1);
        Integer b = Utils.del(3);
        return "hello,world~" + i + "-" + b;
    }

    @GetMapping("/user/{id}")
    @LoginRequired
    public UserRes user(@PathVariable("id") int id){
        UserRes res = new UserRes();
        res.setId(id);
        res.setName("admin");
        return res;
    }

    @GetMapping("/map")
    public String map(){
        return "用户中心，需要登录";
    }
}