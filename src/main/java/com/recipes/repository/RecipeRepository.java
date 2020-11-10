package com.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.entity.Recipe;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
