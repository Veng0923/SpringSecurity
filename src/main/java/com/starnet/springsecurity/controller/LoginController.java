package com.starnet.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author veng
 * @date 2019/8/10 11:06
 */

@Controller
public class LoginController {
    @GetMapping("login")
    public String login(){
        return "login";
    }
//

    @Autowired
    private AuthenticationProvider authenticationProvider;
    @PostMapping(value = "loginAjax")
    public String loginAjax(@RequestParam("username")String username,
                            @RequestParam("password")String password){
        return "a";
    }
}