package com.wit.management.usermanagement.controllers;

import com.wit.management.usermanagement.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("user", new UserDTO());
        return mav;
    }

    @PostMapping(value = "/login-process")
    public ModelAndView loginProcess(UserDTO user){
        System.out.println(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect");
        return mav;
    }
}
