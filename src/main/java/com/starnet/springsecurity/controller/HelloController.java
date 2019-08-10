package com.starnet.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author veng
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "a";
    }
}