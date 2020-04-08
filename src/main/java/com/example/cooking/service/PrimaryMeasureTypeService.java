package com.example.cooking.service;

import com.example.cooking.model.PrimaryMeasureType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PrimaryMeasureTypeService {
    PrimaryMeasureType add(PrimaryMeasureType primaryMeasureType);
    Optional<PrimaryMeasureType> get(Long id);
    PrimaryMeasureType update(PrimaryMeasureType primaryMeasureType);
    void delete(PrimaryMeasureType primaryMeasureType);
}
