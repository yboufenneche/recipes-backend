package com.recipes.errors;

@SuppressWarnings("serial")
public class RecipeNotFoundException extends RuntimeException {

	  public RecipeNotFoundException(Long id) {
	    super("Could not find recipe " + id);
	  }
	}