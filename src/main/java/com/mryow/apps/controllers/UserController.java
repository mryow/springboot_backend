package com.mryow.apps.controllers;

import com.mryow.apps.models.User;
import com.mryow.apps.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // this mean that this class is a controller
@RequestMapping(path = "/user") // this mean url start with /user ( after application base url )
// @EnableJpaRepositories("com.mryow.repositories.UserRepository")
public class UserController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}