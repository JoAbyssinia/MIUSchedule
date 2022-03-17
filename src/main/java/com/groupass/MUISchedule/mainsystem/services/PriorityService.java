package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Priority;
import com.groupass.MUISchedule.mainsystem.repository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PriorityService implements IPriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public Priority save(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public Priority findById(Long id) {
        return priorityRepository.findById(id).get();
    }

    @Override
    public List<Priority> getAllPriority() {
        return priorityRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        priorityRepository.deleteById(id);
    }

    @Override
    public List<Priority> findByIdList(Long id) {
        return priorityRepository.findPrioritiesById(id);
    }
}
