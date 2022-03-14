package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Section;
import com.groupass.MUISchedule.subsystem.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService implements ISectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public Section save(Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public Section findById(Long id) {
        return sectionRepository.findById(id).get();
    }

    @Override
    public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        sectionRepository.deleteById(id);
    }
}
