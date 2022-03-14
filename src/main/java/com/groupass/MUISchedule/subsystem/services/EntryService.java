package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService implements IEntry{
    @Autowired
    private EntryRepository entryRepository;
    @Override
    public Entry getEntryById(Long id) {
        return entryRepository.getById(id);
    }

    @Override
    public Entry saveEntry(Entry entry) {
        return entryRepository.save(entry);
    }

    @Override
    public List<Entry> getAllEntries() {
        return entryRepository.findAll();
    }

    @Override
    public void deleteEntryById(Long id) {
        entryRepository.deleteById(id);
    }
}
