package com.groupass.MUISchedule.subsystem.controllers;


import com.groupass.MUISchedule.subsystem.entities.Track;
import com.groupass.MUISchedule.subsystem.services.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
@CrossOrigin
public class TrackController {

    @Autowired
    private ITrackService trackService;

    @GetMapping("/")
    public List<Track> getAllTrack() {
        return trackService.getAllTracks();
    }

    @PostMapping("/")
    public Track saveTrack(@RequestBody Track track) {
        return trackService.save(track);
    }

    @DeleteMapping("/{id}")
    public void deleteTrack(long id) {
        trackService.deleteById(id);
    }
}
