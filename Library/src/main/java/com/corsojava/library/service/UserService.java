package com.corsojava.library.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.corsojava.library.model.User;
import com.corsojava.library.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	private UserRepository userRepository;
	
	public Optional<User> findById(int userId) {
		return userRepository.findById(userId);
	}

	public MultiValueMap<String, String> create(@Valid User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
