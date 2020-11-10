package com.recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.recipes.entity.Ingredient;
import com.recipes.entity.Recipe;
import com.recipes.repository.IngredientRepository;
//import com.recipes.repository.RecipeRepository;
import com.recipes.repository.RecipeRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {

    return args -> {
    	
    		// create recipes
    		Recipe recipe1 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe2 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe3 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe4 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe5 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe6 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe7 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe8 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe9 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe10 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe11 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe12 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe13 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe14 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe15 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe16 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe17 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe18 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe19 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe20 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe21 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe22 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");
    		Recipe recipe23 = new Recipe("Couscous", "BIO", "Un premier repas Maghribin à base d'ingrédiens orientales.", "https://cdn0.iconfinder.com/data/icons/food-40/32/food_kitchen_plate_spoon_fork_egg_recipe-512.png");

			/*
			 * Ingredient ingredient1 = new Ingredient("Carottes", "Légumes"); 
			 * Ingredient ingredient2 = new Ingredient("Courgettes", "Légumes");
			 * Ingredient ingredient3 = new Ingredient("Vermaicelles", "Pattes"); Ingredient
			 * ingredient4 = new Ingredient("Poulets", "Viandes"); Ingredient ingredient5 =
			 * new Ingredient("Huile d'olive", "Huiles");
			 */
    					
			/*
			 * recipe1.getIngredients().add(ingredient3);
			 * recipe1.getIngredients().add(ingredient4);
			 * recipe1.getIngredients().add(ingredient5);
			 */
    		// add ingredients to recipes
			recipe1.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe1.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe2.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe2.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe3.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe3.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe4.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe4.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe5.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe5.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe6.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe6.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe7.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe7.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe8.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe8.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe9.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe9.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe10.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe10.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe11.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe11.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe12.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe12.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe13.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe13.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe14.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe14.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe15.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe15.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe16.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe16.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe17.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe17.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe18.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe18.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe19.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe19.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe20.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe20.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe21.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe21.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe22.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe22.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe23.getIngredients().add(new Ingredient("Carottes", "Légumes"));
			recipe23.getIngredients().add(new Ingredient("Carottes", "Légumes"));
    		// save recipes
    		log.info("Preloading " + recipeRepository.save(recipe1));
    		log.info("Preloading " + recipeRepository.save(recipe2));
    		log.info("Preloading " + recipeRepository.save(recipe3));
    		log.info("Preloading " + recipeRepository.save(recipe4));
    		log.info("Preloading " + recipeRepository.save(recipe5));
    		log.info("Preloading " + recipeRepository.save(recipe6));
    		log.info("Preloading " + recipeRepository.save(recipe7));
    		log.info("Preloading " + recipeRepository.save(recipe8));
    		log.info("Preloading " + recipeRepository.save(recipe9));
    		log.info("Preloading " + recipeRepository.save(recipe10));
    		log.info("Preloading " + recipeRepository.save(recipe11));
    		log.info("Preloading " + recipeRepository.save(recipe12));
    		log.info("Preloading " + recipeRepository.save(recipe13));
    		log.info("Preloading " + recipeRepository.save(recipe14));
    		log.info("Preloading " + recipeRepository.save(recipe15));
    		log.info("Preloading " + recipeRepository.save(recipe16));
    		log.info("Preloading " + recipeRepository.save(recipe17));
    		log.info("Preloading " + recipeRepository.save(recipe18));
    		log.info("Preloading " + recipeRepository.save(recipe19));
    		log.info("Preloading " + recipeRepository.save(recipe20));
    		log.info("Preloading " + recipeRepository.save(recipe21));
    		log.info("Preloading " + recipeRepository.save(recipe22));
    		log.info("Preloading " + recipeRepository.save(recipe23));
    };
  }
}