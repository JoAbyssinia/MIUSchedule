package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.subsystem.entities.Student;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface IUserService {

    Optional<Users> login(String username, String password);

    Optional<User> findByToken(String token);

    Users findById(Long id);

    Users save(Users users);

    void deleteById(Long id);


}
