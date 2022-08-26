package com.example.liunixdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oyerlicent
 * @create 2022-08-25 22:38
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        System.out.println("hello liunix aya!");
        return "OjbK";
    }
}
