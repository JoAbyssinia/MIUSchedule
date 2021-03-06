package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.mainsystem.services.IUserService;
import com.groupass.MUISchedule.subsystem.entities.Student;
import com.groupass.MUISchedule.subsystem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;


    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(long id){
        studentService.deleteById(id);
    }



}
