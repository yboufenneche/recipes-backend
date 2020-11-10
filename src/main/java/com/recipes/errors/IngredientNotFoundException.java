package com.recipes.errors;

@SuppressWarnings("serial")
public class IngredientNotFoundException extends RuntimeException {

	public IngredientNotFoundException(Long id) {
	    super("Could not find ingredient " + id);
	  }
	}