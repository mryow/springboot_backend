package com.mryow.apps.repositories;

import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;

import com.mryow.apps.models.User;

// @Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    
}
