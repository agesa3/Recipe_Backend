package com.agesadev.recipe.controllers;

import com.agesadev.recipe.model.Directions;
import com.agesadev.recipe.model.Ingredient;
import com.agesadev.recipe.model.Recipe;
import com.agesadev.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    public RecipeService recipeService;

    //get all recipes controller
    @GetMapping
    public List<Recipe> getRecipes(){
        return recipeService.listAllRecipe();
    }

    //add a new recipe controller
    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
    }

    //get all ingredients in the database
    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients(){
       return recipeService.listAllIngredients();
    }

    //add new ingredient
    @PostMapping("/ingredients")
    public void addNewIngredient(@RequestBody Ingredient ingredient){
        recipeService.addIngredient(ingredient);
    }

    //list all directions
    @GetMapping("/directions")
    public List<Directions> listDirections(){
        return recipeService.allDirections();
    }

    //add new Directions
    @PostMapping("/directions")
    public void addNewDirection(@RequestBody Directions directions){
        recipeService.addDirection(directions);
    }

}
