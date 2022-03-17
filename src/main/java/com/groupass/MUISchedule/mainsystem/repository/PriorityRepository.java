package com.groupass.MUISchedule.mainsystem.repository;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import com.groupass.MUISchedule.mainsystem.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {

    @Query("select s from Priority s where s.id = ?1")
    List<Priority> findPrioritiesById(Long id);
}
