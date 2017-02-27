package com.starhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.starhub.model.User;

/**
 * 
 * @author DungNV
 *
 */

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView showLoginPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("loginForm", new User());
        model.setViewName("login");
        return model;
    }
}