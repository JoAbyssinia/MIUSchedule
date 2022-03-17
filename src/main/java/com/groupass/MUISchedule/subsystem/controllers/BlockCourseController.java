package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.subsystem.entities.Block_Course;
import com.groupass.MUISchedule.subsystem.services.IBlock_CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blockcourses")
@CrossOrigin
public class BlockCourseController {

    @Autowired
    private IBlock_CourseService blockCourseService;

    @GetMapping
    public List<Block_Course> getAll(){
        return blockCourseService.getAllBlockCourses();
    }

    @PostMapping
    public Block_Course save(@RequestBody Block_Course course){
        return blockCourseService.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteBlockCourseById(@PathVariable Long id){
        blockCourseService.deleteById(id);
    }
}
