package com.app.restservices.repositories;

import org.springframework.stereotype.Repository;

import com.app.restservices.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository <User,Long>
{

	User findByUsername(String username);

}
