package com.groupass.MUISchedule.subsystem.services;


import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.entities.Student;

import java.util.List;

public interface IStudentService {

    Student save(Student student);

    Student findById(Long id);

    List<Student> getAllStudent();

    void deleteById(Long id);

    List<Student> getStudentByEntry(Entry entry);




}
