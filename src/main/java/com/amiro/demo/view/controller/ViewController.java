package com.amiro.demo.view.controller;

import com.amiro.demo.view.domain.User;
import com.amiro.demo.view.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by DinKim on 20. 07. 05
 */
@RestController
@RequestMapping("/api/v1")
public class ViewController {

    private static final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listAllUser(){
        logger.info(new Date() + "  call listAllUsers method");
        return userService.listAllUsers();
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.PUT)
    public void addUser(User user){
        userService.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PATCH)
    public void updateUser(@PathVariable("id") long id, User user){
        userService.updateById(id, user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
    }
}
