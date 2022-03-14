package com.groupass.MUISchedule.subsystem.repository;

import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
