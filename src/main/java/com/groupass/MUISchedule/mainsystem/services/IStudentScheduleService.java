package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.StudentSchedule;

import java.util.List;

public interface IStudentScheduleService {

    StudentSchedule save(StudentSchedule studentSchedule);

    StudentSchedule findById(Long id);

    List<StudentSchedule> getAllStudentSchedule();

    void deleteById(Long id);

}
