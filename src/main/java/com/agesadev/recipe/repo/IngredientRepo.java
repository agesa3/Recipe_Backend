package com.agesadev.recipe.repo;

import com.agesadev.recipe.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient,Integer> {
}
