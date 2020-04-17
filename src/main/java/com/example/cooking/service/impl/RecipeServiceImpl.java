package com.example.cooking.service.impl;

import com.example.cooking.model.Recipe;
import com.example.cooking.repository.RecipeRepository;
import com.example.cooking.service.RecipeService;

import java.util.Optional;

public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe add(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public Optional<Recipe> get(Long id) {
        return recipeRepository.findById(id);
    }

    @Override
    public Recipe update(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public void delete(Recipe recipe) {
        recipeRepository.delete(recipe);
    }
}
