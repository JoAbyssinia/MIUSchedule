package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Section;
import com.groupass.MUISchedule.subsystem.entities.Track;

import java.util.List;

public interface ISectionService {

    Section save(Section section);

    Section findById(Long id);

    List<Section> getAllSections();

    void deleteById(Long id);

}
