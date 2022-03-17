package com.groupass.MUISchedule.subsystem.facade;

import com.groupass.MUISchedule.subsystem.entities.*;
import com.groupass.MUISchedule.subsystem.services.IEntryService;
import com.groupass.MUISchedule.subsystem.services.ISectionService;
import com.groupass.MUISchedule.subsystem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseRegSubSystemFacade implements ICourseRegSubSystem{
    @Autowired
    private IStudentService studentService;

    @Autowired
    private IEntryService entryService;

    @Autowired
    private ISectionService sectionService;

    @Override
    public Student findStudent(Long id) {
        return studentService.findById(id);
    }

    @Override
    public Entry getEntry(Student student) {
        return student.getEntry();
    }

    @Override
    public Entry getEntryById(Long id) {
        return entryService.getEntryById(id);
    }

    @Override
    public List<Block> getBlocks(Entry entry) {
        return entry.getBlockSet();
    }

    @Override
    public Section getSection(Long id) {
        return sectionService.findById(id);
    }

    @Override
    public List<Section> getAvailableSections(Block block) {
        return block.getSectionList();
    }

    @Override
    public List<Course> getPrerequisites(Course course) {
        return course.getPrerequisite();
    }

    @Override
    public void enrollSection(Student student, Section section) {

    }

    @Override
    public Student saveStudent(Student student) {
        return studentService.save(student);
    }

    @Override
    public Section saveSection(Section section) {
        return sectionService.save(section);
    }

    @Override
    public List<Student> getStudentByEntry(Entry entry) {
        return studentService.getAllStudent();
    }


}
