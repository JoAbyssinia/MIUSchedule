package com.groupass.MUISchedule.mainsystem.controllers;


import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TokenController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public Optional<Users> getToken(@RequestParam("username") final String username, @RequestParam("password") final String password){
        Optional<Users> user = userService.login(username,password);
        if (user.isEmpty()){
            return Optional.empty();
        }
        return user;
    }
}
