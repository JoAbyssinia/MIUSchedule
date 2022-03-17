package com.groupass.MUISchedule.subsystem.repository;

import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.entry = ?1 ")
    List<Student> getStudentByEntry(Entry entry);

}
