package com.asia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Veggiel on 2018/1/18.
 */
@RestController
public class PracticeNginxController {
    @RequestMapping("/testNginx")
    public String helloNginx(){
        return "hello Nginx";
    }
}
