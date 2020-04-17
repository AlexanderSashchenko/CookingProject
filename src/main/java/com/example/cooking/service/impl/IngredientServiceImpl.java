package com.example.cooking.service.impl;

import com.example.cooking.model.Ingredient;
import com.example.cooking.repository.IngredientRepository;
import com.example.cooking.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient add(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Optional<Ingredient> get(Long id) {
        return ingredientRepository.findById(id);
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public void delete(Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
    }
}
