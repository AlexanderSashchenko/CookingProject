package com.example.cooking.service;

import com.example.cooking.model.IngredientQuantity;
import org.springframework.stereotype.Service;

@Service
public interface IngredientQuantityService {

    IngredientQuantity add(IngredientQuantity ingredientQuantity);

    IngredientQuantity get(Long id);

    IngredientQuantity update(IngredientQuantity ingredientQuantity);

    void delete(IngredientQuantity ingredientQuantity);
}
