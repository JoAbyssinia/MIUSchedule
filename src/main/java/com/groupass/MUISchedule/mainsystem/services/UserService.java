package com.groupass.MUISchedule.mainsystem.services;

import com.groupass.MUISchedule.mainsystem.entities.Users;
import com.groupass.MUISchedule.mainsystem.repository.UserRepository;

import com.groupass.MUISchedule.subsystem.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.UUID;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<Users> login(String username, String password) {

        Optional<Users> user = userRepository.login(username, password);
        if (user.isPresent()){
            String token = UUID.randomUUID().toString();
            Users u= user.get();
            u.setToken(token);
            userRepository.save(u);
            return user;
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findByToken(String token) {

        Optional<Users> user = userRepository.findByToken(token);
        if (user.isPresent()){
            Users u = user.get();
            User users1 = new User(u.getUsername(),u.getPassword(),true,true,true,true,
                    AuthorityUtils.createAuthorityList("USER"));
            return Optional.of(users1);
        }
        return Optional.empty();
    }

    @Override
    public Users findById(Long id) {

        Optional<Users> users = userRepository.findById(id);
        return users.orElse(null);
    }

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
