package com.example.springrecipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrecipe.model.Recipe;
import com.example.springrecipe.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private RecipeRepository recipeRepository;
	
	
	
	public RecipeServiceImpl(RecipeRepository theRecipeRepository) {
		recipeRepository = theRecipeRepository;
	}
	
	@Override
	public List<Recipe> findAll() {
		return recipeRepository.findAll();
	}

	@Override
	public Recipe findById(int theId) {
		Optional<Recipe> result = recipeRepository.findById(theId);
		
		Recipe theRecipe = null;
		
		if (result.isPresent()) {
			theRecipe = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theRecipe;
	}

	
	//Saving the recipe
	@Override
	public void save(Recipe theRecipe) {
		recipeRepository.save(theRecipe);
	}

	@Override
	public void deleteById(int theId) {
		recipeRepository.deleteById(theId);
	}

}

