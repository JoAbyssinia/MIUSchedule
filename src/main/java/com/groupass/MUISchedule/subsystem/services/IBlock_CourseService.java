package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Block_Course;
import com.groupass.MUISchedule.subsystem.entities.Section;

import java.util.List;

public interface IBlock_CourseService {


    Block_Course save(Block_Course blockCourse);

    Block_Course findById(Long id);

    List<Block_Course> getAllSections();

    void deleteById(Long id);

}
