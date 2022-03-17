package com.groupass.MUISchedule.mainsystem.dto;

import com.groupass.MUISchedule.subsystem.entities.Block;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entry {

    private Long id;

    private String name;

    private Date startDate;

    private Date endDate;

    private int noStudent;

    private int year;

    @OneToMany
    private List<Block> blockSet = new ArrayList<>();
}
