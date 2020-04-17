package com.example.cooking.service.impl;

import com.example.cooking.model.MeasureType;
import com.example.cooking.repository.MeasureTypeRepository;
import com.example.cooking.service.MeasureTypeService;

import java.util.Optional;

public class MeasureTypeServiceImpl implements MeasureTypeService {

    private final MeasureTypeRepository measureTypeRepository;

    public MeasureTypeServiceImpl(MeasureTypeRepository measureTypeRepository) {
        this.measureTypeRepository = measureTypeRepository;
    }

    @Override
    public MeasureType add(MeasureType measureType) {
        return measureTypeRepository.save(measureType);
    }

    @Override
    public Optional<MeasureType> get(Long id) {
        return measureTypeRepository.findById(id);
    }

    @Override
    public MeasureType update(MeasureType measureType) {
        return measureTypeRepository.save(measureType);
    }

    @Override
    public void delete(MeasureType measureType) {
        measureTypeRepository.delete(measureType);
    }
}
