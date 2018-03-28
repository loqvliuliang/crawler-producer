package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亮 on 2018/3/28.
 */
@RestController
@RequestMapping("/api/test")
public class testController {

    @RequestMapping("/hello")
    public String getHello(@RequestParam  String name){
        return "hello "+name;
    }
}
