package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Track;
import com.groupass.MUISchedule.subsystem.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService implements ITrackService {

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public Track save(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public Track findById(Long id) {
        return trackRepository.findById(id).get();
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        trackRepository.deleteById(id);
    }
}
