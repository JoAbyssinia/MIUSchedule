package com.groupass.MUISchedule.mainsystem.controllers;


import com.groupass.MUISchedule.mainsystem.entities.StudentSchedule;
import com.groupass.MUISchedule.mainsystem.services.IStudentScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private IStudentScheduleService studentScheduleService;


    @GetMapping("/")
    public List<StudentSchedule> getAllSchedule() {
        return studentScheduleService.getAllStudentSchedule();
    }

    @PostMapping("/")
    public StudentSchedule saveSchedule(@RequestBody StudentSchedule studentSchedule) {
        return studentScheduleService.save(studentSchedule);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(long id) {
        studentScheduleService.deleteById(id);
    }
}
