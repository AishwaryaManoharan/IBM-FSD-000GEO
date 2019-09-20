package com.example.springrecipe.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no_of_spoons;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="recipe_id")
	private Recipe recipe;
	
	
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingredients(int no_of_spoons) {
		super();
		this.no_of_spoons = no_of_spoons;
		
	}

}
