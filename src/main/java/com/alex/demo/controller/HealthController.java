package com.alex.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gy on 2016/11/15.
 */
@RestController
public class HealthController {
    @RequestMapping(value= "health")
    public String checkHealth(){
        return "server is running";
    }
}
