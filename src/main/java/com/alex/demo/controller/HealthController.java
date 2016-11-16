package com.alex.demo.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gy on 2016/11/15.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/health")
public class HealthController {

    @RequestMapping(value= "alive",method = RequestMethod.GET)
    @ApiOperation("check server status")
    public String checkHealth(){
        return "server is running";
    }

    @RequestMapping(value= "die",method = RequestMethod.GET)
    @ApiOperation("check server status")
    public String shutDown(){
        return "server is Stop";
    }
}
