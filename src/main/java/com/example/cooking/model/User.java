package com.example.cooking.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    private String email;
    @ManyToMany
    private Set<Role> roles;
    @ManyToMany
    private Set<Ingredient> myIngredients;
    @ManyToMany
    private Set<Recipe> myRecipes;
}
