package com.campusq.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value={"/login"})
    public String displayHome(){
        return "login.html";
    }
}
