package com.groupass.MUISchedule.subsystem.controllers;


import com.groupass.MUISchedule.subsystem.entities.Block;
import com.groupass.MUISchedule.subsystem.services.IBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {

    @Autowired
    private IBlockService blockService;

    @GetMapping("/")
    public List<Block> getAllBlock() {
        return blockService.getAllBlocks();
    }

    @PostMapping("/")
    public Block saveBlock(@RequestBody Block block) {
        return blockService.save(block);
    }

    @DeleteMapping("/{id}")
    public void deleteBlack(long id) {
        blockService.deleteById(id);
    }
}
