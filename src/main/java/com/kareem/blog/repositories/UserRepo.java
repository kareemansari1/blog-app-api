package com.kareem.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kareem.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
