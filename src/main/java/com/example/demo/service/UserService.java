package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> saveUsers(List<User> users){
		return userRepository.saveAll(users);
	}
	
	public List<User> getUserByIdCompany(int id_company){
		return userRepository.findByIdCompany(id_company);
	}
	public List<User> getUserName(String name_user){
		return userRepository.findByNameUser(name_user);
	}
}
