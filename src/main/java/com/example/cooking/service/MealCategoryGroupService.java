package com.example.cooking.service;

import com.example.cooking.model.MealCategoryGroup;
import org.springframework.stereotype.Service;

@Service
public interface MealCategoryGroupService {

    MealCategoryGroup add(MealCategoryGroup mealCategoryGroup);

    MealCategoryGroup get(Long id);

    MealCategoryGroup update(MealCategoryGroup mealCategoryGroup);

    void delete(MealCategoryGroup mealCategoryGroup);
}
