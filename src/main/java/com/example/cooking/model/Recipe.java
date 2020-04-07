package com.example.cooking.model;

import java.io.File;
import java.util.Map;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private File photo;
    private String description;
    @ManyToMany
    private Set<DishType> dishTypes;
    @ManyToMany
    private Set<MealTime> mealTimes;
    @ManyToMany
    private Map<Ingredient, IngredientQuantity> ingredients;
    private Integer portionsQuantity;
    private Integer portionWeight;
    private Integer preparationTime;
}
