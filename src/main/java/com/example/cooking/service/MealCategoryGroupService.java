package com.example.cooking.service;

import com.example.cooking.model.MealCategoryGroup;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MealCategoryGroupService {
    MealCategoryGroup add(MealCategoryGroup mealCategoryGroup);
    Optional<MealCategoryGroup> get(Long id);
    MealCategoryGroup update(MealCategoryGroup mealCategoryGroup);
    void delete(MealCategoryGroup mealCategoryGroup);
}
