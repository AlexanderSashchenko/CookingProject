package com.example.cooking.service;

import com.example.cooking.model.IngredientQuantity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IngredientQuantityService {
    IngredientQuantity add(IngredientQuantity ingredientQuantity);
    Optional<IngredientQuantity> get(Long id);
    IngredientQuantity update(IngredientQuantity ingredientQuantity);
    void delete(IngredientQuantity ingredientQuantity);
}
