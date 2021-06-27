package com.app.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.restservices.entities.User;
import com.app.restservices.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		System.out.println("Controller");
		return userService.getAllUsers();

	}

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);

	}

	//
	@GetMapping("/getUser/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id) {
		return userService.getUserById(id);

	}

	@PostMapping("/updateUser/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		user.setId(id);
		return userService.updateUser(id, user);

	}

	@GetMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);

	}
	
	@GetMapping("/getUserByUser/{username}")
	public User getUser(@PathVariable("username") String username) {
		return userService.getUser(username);

	}

}
