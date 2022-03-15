package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Entry;

import java.util.List;

public interface IEntryService {

    Entry getEntryById(Long id);

    Entry saveEntry(Entry entry);

    List<Entry> getAllEntries();

    void deleteEntryById(Long id);
}
