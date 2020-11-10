package com.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.entity.Ingredient;
import com.recipes.errors.IngredientNotFoundException;
import com.recipes.repository.IngredientRepository;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	// Aggregate root
	
	@GetMapping("/all")
	public List<Ingredient> getAllIngredients (){
		return ingredientRepository.findAll();				
	}
	
	@PostMapping
	Ingredient addIngredient(@RequestBody Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}
	
	// Single item
	
	@GetMapping("/{id}")
	  Ingredient getOne(@PathVariable Long id) {

	    return ingredientRepository.findById(id)
	      .orElseThrow(() -> new IngredientNotFoundException(id));
	  }

	 @PutMapping("/{id}")
	 Ingredient replaceIngredient(@RequestBody Ingredient ingredient, @PathVariable Long id) {

	    return ingredientRepository.findById(id)
	      .map(ing -> {
	        ing.setName(ingredient.getName());
	        return ingredientRepository.save(ing);
	      })
	      .orElseGet(() -> {
	        ingredient.setId(id);
	        return ingredientRepository.save(ingredient);
	      });
	  }

	  @DeleteMapping("/{id}")
	  void deleteIngredient(@PathVariable Long id) {
	    ingredientRepository.deleteById(id);
	  }
}
