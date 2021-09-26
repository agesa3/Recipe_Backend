package com.agesadev.recipe.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int recipe_id;
    private String recipe_name;

    @OneToMany(targetEntity = Ingredient.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_fk_ingredient",referencedColumnName = "recipe_id")
    private List<Ingredient> ingredients;

    @OneToMany(targetEntity = Directions.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_fk_direction",referencedColumnName = "recipe_id")
    private List<Directions> directions;

}
