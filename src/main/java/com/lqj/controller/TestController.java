package com.lqj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lqj
 * @Date 2023-01-09 14:27
 */
@Controller
public class TestController {


    @GetMapping
    public void test(){

        System.out.println("test");

    }

}
