package com.example.springrecipe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springrecipe.model.Recipe;
import com.example.springrecipe.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

	private RecipeService recipeService;
	
	public RecipeController(RecipeService theRecipeService) {
		recipeService = theRecipeService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Recipe> theRecipes = recipeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("recipes", theRecipes);
		
		return "recipes/list-page";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Recipe theRecipe=new Recipe();
		
		theModel.addAttribute("recipe", theRecipe);
		
		return "recipes/showFormForAdd";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("recipe") Recipe theRecipe) {
		
		// save the employee
		recipeService.save(theRecipe);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:recipes/list-page";
	}
	
	
}



