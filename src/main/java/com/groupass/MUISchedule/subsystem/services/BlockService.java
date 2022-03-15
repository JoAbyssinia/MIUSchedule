package com.groupass.MUISchedule.subsystem.services;

import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockService implements IBlockService {

    @Autowired
    private BlockRepository blockRepository;

    @Override
    public Block save(Block block) {
        return blockRepository.save(block);
    }

    @Override
    public Block findById(Long id) {
        return blockRepository.findById(id).get();
    }

    @Override
    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        blockRepository.deleteById(id);
    }
}
