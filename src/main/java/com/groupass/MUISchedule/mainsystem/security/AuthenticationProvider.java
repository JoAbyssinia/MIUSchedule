package com.groupass.MUISchedule.mainsystem.security;

import com.groupass.MUISchedule.mainsystem.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    IUserService userService;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username,
                                       UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {

        Object token = authentication.getCredentials();

        return Optional.ofNullable(token)
                .map(String::valueOf)
                .flatMap(userService::findByToken)
                .orElseThrow(() -> new UsernameNotFoundException("Cant find user with authentication token =" + token));
    }
}
