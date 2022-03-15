package com.groupass.MUISchedule.mainsystem.repository;


import com.groupass.MUISchedule.mainsystem.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    @Query(value = "SELECT u FROM Users u where u.username = ?1 and u.password = ?2 ")
    Optional<Users> login(String username, String password);

    Optional<Users> findByToken(String token);



}
