package com.example.cooking.service;

import com.example.cooking.model.MeasureType;
import org.springframework.stereotype.Service;

@Service
public interface MeasureTypeService {

    MeasureType add(MeasureType measureType);

    MeasureType get(Long id);

    MeasureType update(MeasureType measureType);

    void delete(MeasureType measureType);
}
