package com.groupass.MUISchedule.mainsystem.controllers;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import com.groupass.MUISchedule.mainsystem.services.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priority")
@CrossOrigin
public class PriorityController {

    @Autowired
    private IPriorityService priorityService;


    @GetMapping("/")
    public List<Priority> getAllPriority() {
        return priorityService.getAllPriority();
    }

    @PostMapping("/")
    public Priority saveStudent(@RequestBody Priority priority) {
        return priorityService.save(priority);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(long id) {
        priorityService.deleteById(id);
    }


}
