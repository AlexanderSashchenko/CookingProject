package com.example.cooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class MealEating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime localDateTime;
    @ManyToMany
    private List<Recipe> recipes;
    @ManyToMany
    private List<Ingredient> ingredients;
}
