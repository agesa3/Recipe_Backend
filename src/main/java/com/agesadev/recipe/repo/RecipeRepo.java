package com.agesadev.recipe.repo;

import com.agesadev.recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Integer> {
}
