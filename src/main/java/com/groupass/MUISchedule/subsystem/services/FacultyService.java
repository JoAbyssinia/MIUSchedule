package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Faculty;
import com.groupass.MUISchedule.subsystem.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService implements IFaculty{
    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public Faculty getFacultyById(Long id) {
        return facultyRepository.getById(id);
    }

    @Override
    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public void deleteFacultyById(Long id) {
        facultyRepository.deleteById(id);
    }
}
