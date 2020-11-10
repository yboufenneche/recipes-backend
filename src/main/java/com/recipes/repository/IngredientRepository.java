package com.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
