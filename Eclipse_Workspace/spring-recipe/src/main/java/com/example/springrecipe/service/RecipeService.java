package com.example.springrecipe.service;

import java.util.List;

import com.example.springrecipe.model.Recipe;

public interface RecipeService {

	public List<Recipe> findAll();
	
	public Recipe findById(int theId);
	
	public void save(Recipe theRecipe);
	
	public void deleteById(int theId);
	
}