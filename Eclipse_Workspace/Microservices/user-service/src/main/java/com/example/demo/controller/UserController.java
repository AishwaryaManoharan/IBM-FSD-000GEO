package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel userDetail){
		ModelMapper mapper = new ModelMapper();
		UserDto dto = mapper.map(userDetail, UserDto.class);
		UserDto dto1 = service.createUser(dto);
		CreateUserResponseModel user = mapper.map(dto1, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	
	}
	
	@GetMapping("/user")
	public List<ResponseEntity<CreateUserResponseModel>> getUsers(){
		List<User> users = service.getAllUsers();
		List<ResponseEntity<CreateUserResponseModel>> list = new ArrayList<ResponseEntity<CreateUserResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(User u : users) {
			CreateUserResponseModel res = mapper.map(u, CreateUserResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return list;
	}
	
	
}