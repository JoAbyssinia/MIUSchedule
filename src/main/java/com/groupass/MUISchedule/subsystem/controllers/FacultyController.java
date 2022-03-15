package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.subsystem.services.IFacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    private IFacultyService facultyService;


}
