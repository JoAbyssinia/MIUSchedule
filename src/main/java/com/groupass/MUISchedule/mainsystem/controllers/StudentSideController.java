package com.groupass.MUISchedule.mainsystem.controllers;

import com.groupass.MUISchedule.subsystem.entities.Student;
import com.groupass.MUISchedule.subsystem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentSideController {

    @Autowired
    private IStudentService studentService;

    @GetMapping(value = "/api/users/user/{id}", produces = "application/json")
    public Student getUserDetail(@PathVariable Long id) {
        return studentService.findById(id);
    }
}
