package com.app.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.restservices.entities.User;
import com.app.restservices.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userepository;

	public List<User> getAllUsers() {
		return userepository.findAll();

	}

	public User createUser(User user) {
		return userepository.save(user);
	}

	public Optional<User> getUserById(Long id) {
		Optional<User> user = userepository.findById(id);
		return user;
	}

	public User updateUser(Long id, User user) {
		user.setId(id);
		return userepository.save(user);

	}

	public void deleteUser(Long id) {
		if (userepository.findById(id).isPresent()) {

			userepository.deleteById(id);

		}
	}

	public User getUser(String username) {
	
		return userepository.findByUsername(username);
	}
}
