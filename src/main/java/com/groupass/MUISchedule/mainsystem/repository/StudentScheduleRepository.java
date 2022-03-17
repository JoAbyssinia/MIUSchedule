package com.groupass.MUISchedule.mainsystem.repository;

import com.groupass.MUISchedule.mainsystem.entities.StudentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScheduleRepository extends JpaRepository<StudentSchedule, Long> {
}
