package com.example.sideproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sideproject.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
