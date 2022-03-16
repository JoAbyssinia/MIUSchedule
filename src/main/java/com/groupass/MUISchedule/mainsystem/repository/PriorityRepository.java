package com.groupass.MUISchedule.mainsystem.repository;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
