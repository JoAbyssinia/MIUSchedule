package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import com.groupass.MUISchedule.subsystem.entities.Faculty;
import com.groupass.MUISchedule.subsystem.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService implements IFacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private IUserService userService;

    @Override
    public Faculty getFacultyById(Long id) {
        return facultyRepository.getById(id);
    }

    @Override
    public Faculty saveFaculty(Faculty faculty) {
        Faculty f = facultyRepository.save(faculty);
        Users users = f.createUser();
        userService.save(users);
        return f;
    }

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public void deleteFacultyById(Long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public void deleteFaculty(Faculty faculty) {
        facultyRepository.delete(faculty);
    }
}
