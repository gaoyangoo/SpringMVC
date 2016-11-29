package com.alex.demo.controller;

import com.alex.demo.domain.User;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yang_gao on 2016/11/16.
 */
@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "*")
public class UserController {


    @ApiOperation(value = "return result of login",response = String.class)
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "success";
    }

    @ApiOperation("return result of register")
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ResponseEntity<String> register(){
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

    @ApiOperation("return all users")
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public ResponseEntity<User> getUser(){
        User temp = new User();
        temp.setUserName("test");
        temp.setAge("20");
        return new ResponseEntity<User>(temp, HttpStatus.OK);
    }

    @RequestMapping(value="/createUser",method= RequestMethod.POST)
    public User createUser(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }
}
