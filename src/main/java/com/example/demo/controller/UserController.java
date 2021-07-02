package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/addListUser")
	public List<User> addUsers(@RequestBody List<User> users){
		return userService.saveUsers(users);
	}
	@GetMapping("/getUserIdCompany/{id_company}")
	public List<User> findByIdCompany(@PathVariable int id_company){
		return userService.getUserByIdCompany(id_company);
	}
	
	@GetMapping("/getUserName/{name_user}")
	public List<User> findByNameUser(@PathVariable String name_user){
		return userService.getUserName(name_user);
	}
}
