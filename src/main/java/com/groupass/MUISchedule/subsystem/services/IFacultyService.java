package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Faculty;

import java.util.List;

public interface IFacultyService {

    Faculty getFacultyById(Long id);

    Faculty saveFaculty(Faculty faculty);

    List<Faculty> getAllFaculties();

    void deleteFacultyById(Long id);
}
