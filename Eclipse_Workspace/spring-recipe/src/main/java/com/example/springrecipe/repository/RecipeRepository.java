package com.example.springrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springrecipe.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}