package com.example.cooking.service;

import com.example.cooking.model.Recipe;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface RecipeService {

    Recipe add(Recipe recipe);

    Recipe get(Long id);

    Recipe update(Recipe recipe);

    List<Recipe> getAll();

    void delete(Recipe recipe);
}
