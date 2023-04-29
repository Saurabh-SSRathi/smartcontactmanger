package com.smart.controller;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/test")
    @ResponseBody
    public String test(){
        User user = new User();
        user.setName("Saurabh Rathi");
        user.setEmail("saurabh@gmail.com");
        userRepository.save(user);
        return "Working";
    }



}



