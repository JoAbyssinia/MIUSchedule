package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.subsystem.entities.Section;
import com.groupass.MUISchedule.subsystem.services.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sections")
@CrossOrigin
public class SectionController {

    @Autowired
    private ISectionService sectionService;

    @GetMapping
    public List<Section> getAllSections(){
        return sectionService.getAllSections();
    }

    @PostMapping
    public Section saveSection(@RequestBody Section section){
        return sectionService.save(section);
    }

    @DeleteMapping("/{id}")
    public void deleteSectionById(@PathVariable Long id){
        sectionService.deleteById(id);
    }
}
