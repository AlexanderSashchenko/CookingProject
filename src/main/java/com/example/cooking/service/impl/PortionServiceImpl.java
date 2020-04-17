package com.example.cooking.service.impl;

import com.example.cooking.model.Portion;
import com.example.cooking.repository.PortionRepository;
import com.example.cooking.service.PortionService;

import java.util.Optional;

public class PortionServiceImpl implements PortionService {

    private final PortionRepository portionRepository;

    public PortionServiceImpl(PortionRepository portionRepository) {
        this.portionRepository = portionRepository;
    }

    @Override
    public Portion add(Portion portion) {
        return portionRepository.save(portion);
    }

    @Override
    public Optional<Portion> get(Long id) {
        return portionRepository.findById(id);
    }

    @Override
    public Portion update(Portion portion) {
        return portionRepository.save(portion);
    }

    @Override
    public void delete(Portion portion) {
        portionRepository.delete(portion);
    }
}
