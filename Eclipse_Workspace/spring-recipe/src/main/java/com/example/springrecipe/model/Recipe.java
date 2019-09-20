package com.example.springrecipe.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity

public class Recipe {
	
	public int getRecipe_id() {
		return recipe_id;
	}

	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
	}

	public int getPreptime() {
		return preptime;
	}

	public void setPreptime(int preptime) {
		this.preptime = preptime;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int recipe_id;
	private int preptime;
	private String difficulty;
	
//	@OneToMany(mappedBy = "recipes")
//	private Set<Ingredients> ingredients=new HashSet<>();
//	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(int preptime, String difficulty) {
		super();
		this.preptime = preptime;
		this.difficulty = difficulty;
		}
}
