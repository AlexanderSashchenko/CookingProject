package com.example.cooking.service.impl;

import com.example.cooking.model.IngredientQuantity;
import com.example.cooking.repository.IngredientQuantityRepository;
import com.example.cooking.service.IngredientQuantityService;

import java.util.Optional;

public class IngredientQuantityServiceImpl implements IngredientQuantityService {

    private final IngredientQuantityRepository ingredientQuantityRepository;

    public IngredientQuantityServiceImpl(IngredientQuantityRepository ingredientQuantityRepository) {
        this.ingredientQuantityRepository = ingredientQuantityRepository;
    }

    @Override
    public IngredientQuantity add(IngredientQuantity ingredientQuantity) {
        return ingredientQuantityRepository.save(ingredientQuantity);
    }

    @Override
    public Optional<IngredientQuantity> get(Long id) {
        return ingredientQuantityRepository.findById(id);
    }

    @Override
    public IngredientQuantity update(IngredientQuantity ingredientQuantity) {
        return ingredientQuantityRepository.save(ingredientQuantity);
    }

    @Override
    public void delete(IngredientQuantity ingredientQuantity) {
        ingredientQuantityRepository.delete(ingredientQuantity);
    }
}
