package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.subsystem.entities.Faculty;
import com.groupass.MUISchedule.subsystem.services.IFacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    private IFacultyService facultyService;

    @GetMapping
    public List<Faculty> getAllFaculties() {
        return facultyService.getAllFaculties();
    }

    @PostMapping
    public Faculty saveFaculty(@RequestBody Faculty faculty) {
        return facultyService.saveFaculty(faculty);
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFacultyById(id);
    }

}
