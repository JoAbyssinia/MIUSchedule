package com.groupass.MUISchedule.mainsystem.entities;

import com.groupass.MUISchedule.subsystem.entities.Section;
import com.groupass.MUISchedule.subsystem.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long  studentId;

    private Long sectionId;



}
