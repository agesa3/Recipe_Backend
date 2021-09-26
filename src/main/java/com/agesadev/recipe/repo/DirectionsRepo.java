package com.agesadev.recipe.repo;

import com.agesadev.recipe.model.Directions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionsRepo extends JpaRepository<Directions,Integer> {
}
