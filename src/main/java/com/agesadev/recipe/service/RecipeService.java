package com.agesadev.recipe.service;

import com.agesadev.recipe.model.Directions;
import com.agesadev.recipe.model.Ingredient;
import com.agesadev.recipe.model.Recipe;
import com.agesadev.recipe.repo.DirectionsRepo;
import com.agesadev.recipe.repo.IngredientRepo;
import com.agesadev.recipe.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    public RecipeRepo recipeRepo;

    @Autowired
    public IngredientRepo ingredientRepo;

    @Autowired
    public DirectionsRepo directionsRepo;

    //list all recipes
    public List<Recipe> listAllRecipe(){
        return recipeRepo.findAll();
    }

    //addRecipe
    public String addRecipe(Recipe recipe){
        recipeRepo.save(recipe);
        return "Saved Recipe Successfully";
    }

    //list all Ingredients
    public List<Ingredient> listAllIngredients(){
        return ingredientRepo.findAll();
    }

    //addIngredient
    public String addIngredient(Ingredient ingredient){
        ingredientRepo.save(ingredient);
        return "Ingredient Saved Successfully";
    }

    //List all directions
    public List<Directions> allDirections(){
        return directionsRepo.findAll();
    }

    //addDirections
    public String addDirection(Directions directions){
        directionsRepo.save(directions);
        return "Direction Saved Successfully";
    }


}
