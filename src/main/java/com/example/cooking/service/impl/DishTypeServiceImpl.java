package com.example.cooking.service.impl;

import com.example.cooking.model.DishType;
import com.example.cooking.repository.DishTypeRepository;
import com.example.cooking.service.DishTypeService;

import java.util.Optional;

public class DishTypeServiceImpl implements DishTypeService {

    private final DishTypeRepository dishTypeRepository;

    public DishTypeServiceImpl(DishTypeRepository dishTypeRepository) {
        this.dishTypeRepository = dishTypeRepository;
    }

    @Override
    public DishType add(DishType dishType) {
        return dishTypeRepository.save(dishType);
    }

    @Override
    public Optional<DishType> get(Long id) {
        return dishTypeRepository.findById(id);
    }

    @Override
    public DishType update(DishType dishType) {
        return dishTypeRepository.save(dishType);
    }

    @Override
    public void delete(DishType dishType) {
        dishTypeRepository.delete(dishType);
    }
}
