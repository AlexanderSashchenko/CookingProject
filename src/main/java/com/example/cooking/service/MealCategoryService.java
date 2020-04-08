package com.example.cooking.service;

import com.example.cooking.model.MealCategory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MealCategoryService {
    MealCategory add(MealCategory mealCategory);
    Optional<MealCategory> get(Long id);
    MealCategory update(MealCategory mealCategory);
    void delete(MealCategory mealCategory);
}
