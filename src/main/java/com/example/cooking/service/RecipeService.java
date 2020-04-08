package com.example.cooking.service;

import com.example.cooking.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RecipeService {
    Recipe add(Recipe recipe);
    Optional<Recipe> get(Long id);
    Recipe update(Recipe recipe);
    void delete(Recipe recipe);
}
