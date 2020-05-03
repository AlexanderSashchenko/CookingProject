package com.example.cooking.service;

import com.example.cooking.model.Portion;
import org.springframework.stereotype.Service;

@Service
public interface PortionService {

    Portion add(Portion portion);

    Portion get(Long id);

    Portion update(Portion portion);

    void delete(Portion portion);
}
