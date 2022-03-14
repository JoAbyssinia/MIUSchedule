package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.entities.Track;

import java.util.List;

public interface ITrackService {
    Track save(Track track);

    Track findById(Long id);

    List<Track> getAllTracks();

    void deleteById(Long id);
}
