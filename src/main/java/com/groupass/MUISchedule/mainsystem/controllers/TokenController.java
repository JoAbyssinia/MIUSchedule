package com.groupass.MUISchedule.mainsystem.controllers;


import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
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

//    @GetMapping("/me")
//    public UserDetails geMe() {
//
//        log.info("getme "+SecurityContextHolder.getContext().getAuthentication());
//       return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//    }


}
