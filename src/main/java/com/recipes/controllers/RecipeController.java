package com.recipes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.entity.Recipe;
import com.recipes.errors.RecipeNotFoundException;
import com.recipes.repository.RecipeRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;

	@GetMapping("/all")
	public List<Recipe> getAllRecipes() {
		return recipeRepository.findAll();
	}

	@PostMapping
	Recipe addIngredient(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
	// Single item

	@GetMapping("/{id}")
	Recipe getOne(@PathVariable Long id) {

		return recipeRepository.findById(id)
			.orElseThrow(() -> new RecipeNotFoundException(id));
	}

	@PutMapping("/{id}")
	Recipe replaceRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {

		return recipeRepository.findById(id).map(rec -> {
			rec.setName(recipe.getName());
			return recipeRepository.save(rec);
		}).orElseGet(() -> {
			recipe.setId(id);
			return recipeRepository.save(recipe);
		});
	}

	@DeleteMapping("/{id}")
	void deleteRecipe(@PathVariable Long id) {
		recipeRepository.deleteById(id);
	}
}
