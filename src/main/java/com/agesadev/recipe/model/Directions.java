package com.agesadev.recipe.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "directions")
public class Directions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int directions_id;
    private String direction;
}
