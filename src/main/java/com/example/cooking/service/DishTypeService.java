package com.example.cooking.service;

import com.example.cooking.model.DishType;
import org.springframework.stereotype.Service;

@Service
public interface DishTypeService {

    DishType add(DishType dishType);

    DishType get(Long id);

    DishType update(DishType dishType);

    void delete(DishType dishType);
}
