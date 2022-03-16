package com.groupass.MUISchedule.mainsystem.entities;

import com.groupass.MUISchedule.mainsystem.utils.UserType;
import com.groupass.MUISchedule.subsystem.entities.Faculty;
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

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;

    private String password;

    private String token;

    private UserType role;

    @OneToOne
    private Student student;

    @OneToOne
    private Faculty faculty;



}
