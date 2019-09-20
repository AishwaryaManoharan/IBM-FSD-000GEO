package com.example.springjoke.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Joke {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String message;
	
	public Joke() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joke(String message) {
		super();
		this.message = message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}