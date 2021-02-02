package com.mryow.repositories;

import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;

import com.mryow.models.User;

// @Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    
}
