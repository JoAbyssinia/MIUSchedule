package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.repository.UserRepository;
import com.groupass.MUISchedule.mainsystem.services.IUserService;
import com.groupass.MUISchedule.mainsystem.services.UserService;
import com.groupass.MUISchedule.mainsystem.utils.UserType;
import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.entities.Student;
import com.groupass.MUISchedule.subsystem.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserService userService;

    @Override
    public Student save(Student student) {
        Student s = studentRepository.save(student);
        Users users = s.createUser();
        userService.save(users);
        return s;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentByEntry(Entry entry) {
        return null;
    }
}
