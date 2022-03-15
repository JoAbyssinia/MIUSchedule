package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Block;

import java.util.List;

public interface IBlockService {

    Block save(Block block);

    Block findById(Long id);

    List<Block> getAllBlocks();

    void deleteById(Long id);
}
