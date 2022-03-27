package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: axemc
 * @dateTime: 2022/03/27 12:27:00
 */
@RestController
public class TestController {

    @RequestMapping
    public String test() {
        return "test spring-boot!";
    }

}
