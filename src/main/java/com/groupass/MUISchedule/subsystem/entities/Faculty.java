package com.groupass.MUISchedule.subsystem.entities;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.utils.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Faculty{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;

    private String lastName;

    @ElementCollection
    private List<String> speciality ;

    public Users createUser(){
        return new Users(null,(firstName + lastName).toLowerCase(),
                "123456789","", UserType.FAC, null ,this);
    }
}
