package com.groupass.MUISchedule.mainsystem.controllers;


import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class TokenController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public Optional<Users> getToken(@RequestBody Users users) {
        Optional<Users> user = userService.login(users.getUsername(), users.getPassword());
        if (user.isEmpty()) {
            return Optional.empty();
        }
        return user;
    }
}
