package com.example.medicalschedule.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.medicalschedule.Model.User;
import com.example.medicalschedule.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

	UserRepository userRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}
}
