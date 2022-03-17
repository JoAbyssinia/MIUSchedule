package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.StudentSchedule;
import com.groupass.MUISchedule.mainsystem.repository.StudentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScheduleService implements IStudentScheduleService {

    @Autowired
    private StudentScheduleRepository studentScheduleRepository;


    @Override
    public StudentSchedule save(StudentSchedule studentSchedule) {
        return studentScheduleRepository.save(studentSchedule);
    }

    @Override
    public StudentSchedule findById(Long id) {
        return studentScheduleRepository.getById(id);
    }

    @Override
    public List<StudentSchedule> getAllStudentSchedule() {
        return studentScheduleRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        studentScheduleRepository.deleteById(id);
    }
}
