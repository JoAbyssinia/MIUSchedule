package com.groupass.MUISchedule.subsystem.facade;

import com.groupass.MUISchedule.subsystem.entities.*;

import java.util.List;

public interface ICourseRegSubSystem {

    Student findStudent(Long id);

    Entry getEntry(Student student);

    Entry getEntryById(Long id);

    List<Block> getBlocks(Entry entry);

    Section getSection(Long id);

    List<Section> getAvailableSections(Block block);

    List<Course> getPrerequisites(Course course);

    void enrollSection(Student student, Section section);

    Student saveStudent(Student student);

    Section saveSection(Section section);

    List<Student> getStudentByEntry(Entry entry);

}
