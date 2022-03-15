package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Block_Course;
import com.groupass.MUISchedule.subsystem.repository.Block_CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Black_CourseService implements IBlock_CourseService {

    @Autowired
    private Block_CourseRepository block_courseRepository;

    @Override
    public Block_Course save(Block_Course blockCourse) {
        return block_courseRepository.save(blockCourse);
    }

    @Override
    public Block_Course findById(Long id) {
        return block_courseRepository.findById(id).get();
    }

    @Override
    public List<Block_Course> getAllBlockCourses() {
        return block_courseRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        block_courseRepository.deleteById(id);
    }
}
