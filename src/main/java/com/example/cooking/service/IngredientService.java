package com.example.cooking.service;

import com.example.cooking.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IngredientService {
    Ingredient add(Ingredient ingredient);
    Optional<Ingredient> get(Long id);
    Ingredient update(Ingredient ingredient);
    void delete(Ingredient ingredient);
}
