package com.example.cooking.service;

import com.example.cooking.model.MealCategory;
import org.springframework.stereotype.Service;

@Service
public interface MealCategoryService {

    MealCategory add(MealCategory mealCategory);

    MealCategory get(Long id);

    MealCategory update(MealCategory mealCategory);

    void delete(MealCategory mealCategory);
}
