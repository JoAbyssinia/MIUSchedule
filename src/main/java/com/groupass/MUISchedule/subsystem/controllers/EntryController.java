package com.groupass.MUISchedule.subsystem.controllers;

import com.groupass.MUISchedule.subsystem.entities.Entry;
import com.groupass.MUISchedule.subsystem.services.IEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private IEntryService entryService;

    @GetMapping
    public List<Entry> getAllEntry() {
        return entryService.getAllEntries();
    }

    @PostMapping("/")
    public Entry saveEntry(Entry entry) {
        return entryService.saveEntry(entry);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(long id) {
        entryService.deleteEntryById(id);
    }

}
