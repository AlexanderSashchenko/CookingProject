package com.example.cooking.service;

import com.example.cooking.model.MeasureType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MeasureTypeService {
    MeasureType add(MeasureType measureType);
    Optional<MeasureType> get(Long id);
    MeasureType update(MeasureType measureType);
    void delete(MeasureType measureType);
}
