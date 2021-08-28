package com.example.medicalschedule.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalschedule.bo.User;
import com.example.medicalschedule.services.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		List<User> users = userService.getAll();
		return users;
	}
}
