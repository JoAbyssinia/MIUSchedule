package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Priority;

import java.util.List;

public interface IPriorityService {


    Priority save(Priority priority);

    Priority findById(Long id);

    List<Priority> getAllPriority();

    void deleteById(Long id);
}
