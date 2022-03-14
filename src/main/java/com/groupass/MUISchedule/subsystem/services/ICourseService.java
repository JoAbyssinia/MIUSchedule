package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Course;

import java.util.List;

public interface ICourseService {

    Course save(Course course);

    Course findById(Long id);

    List<Course> getAllCourses();

    void deleteById(Long id);
}
