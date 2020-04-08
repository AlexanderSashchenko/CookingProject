package com.example.cooking.service;

import com.example.cooking.model.DishType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface DishTypeService {
    DishType add(DishType dishType);
    Optional<DishType> get(Long id);
    DishType update(DishType dishType);
    void delete(DishType dishType);
}
