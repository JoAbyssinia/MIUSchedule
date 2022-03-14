package com.groupass.MUISchedule.subsystem.repository;

import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.entities.Block_Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Block_CourseRepository extends JpaRepository<Block_Course, Long> {
}
