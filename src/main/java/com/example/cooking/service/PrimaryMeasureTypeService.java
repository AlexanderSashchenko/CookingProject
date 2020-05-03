package com.example.cooking.service;

import com.example.cooking.model.PrimaryMeasureType;
import org.springframework.stereotype.Service;

@Service
public interface PrimaryMeasureTypeService {

    PrimaryMeasureType add(PrimaryMeasureType primaryMeasureType);

    PrimaryMeasureType get(Long id);

    PrimaryMeasureType update(PrimaryMeasureType primaryMeasureType);

    void delete(PrimaryMeasureType primaryMeasureType);
}
