package com.groupass.MUISchedule.mainsystem.controllers;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentSideController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/api/users/user/{id}", produces = "application/json")
    public Users getUserDetail(@PathVariable Long id) {
        return userService.findById(id);
    }
}
