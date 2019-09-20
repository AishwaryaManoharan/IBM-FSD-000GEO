package com.example.springrecipe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springrecipe.model.Ingredients;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredients, Integer> {

}