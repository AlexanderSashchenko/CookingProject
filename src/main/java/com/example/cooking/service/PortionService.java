package com.example.cooking.service;

import com.example.cooking.model.Portion;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PortionService {
    Portion add(Portion portion);
    Optional<Portion> get(Long id);
    Portion update(Portion portion);
    void delete(Portion portion);
}
