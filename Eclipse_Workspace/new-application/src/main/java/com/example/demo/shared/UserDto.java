package com.example.demo.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	private String bcrypetedPassword;
	private String password;
	
}