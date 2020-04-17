package com.example.cooking.service.impl;

import com.example.cooking.model.PrimaryMeasureType;
import com.example.cooking.repository.PrimaryMeasureTypeRepository;
import com.example.cooking.service.PrimaryMeasureTypeService;

import java.util.Optional;

public class PrimaryMeasureTypeServiceImpl implements PrimaryMeasureTypeService {

    private final PrimaryMeasureTypeRepository primaryMeasureTypeRepository;

    public PrimaryMeasureTypeServiceImpl(PrimaryMeasureTypeRepository primaryMeasureTypeRepository) {
        this.primaryMeasureTypeRepository = primaryMeasureTypeRepository;
    }

    @Override
    public PrimaryMeasureType add(PrimaryMeasureType primaryMeasureType) {
        return primaryMeasureTypeRepository.save(primaryMeasureType);
    }

    @Override
    public Optional<PrimaryMeasureType> get(Long id) {
        return primaryMeasureTypeRepository.findById(id);
    }

    @Override
    public PrimaryMeasureType update(PrimaryMeasureType primaryMeasureType) {
        return primaryMeasureTypeRepository.save(primaryMeasureType);
    }

    @Override
    public void delete(PrimaryMeasureType primaryMeasureType) {
        primaryMeasureTypeRepository.delete(primaryMeasureType);
    }
}
