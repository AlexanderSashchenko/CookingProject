package com.example.cooking.service;

import com.example.cooking.model.DailyMenu;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface DailyMenuService {
    DailyMenu add(DailyMenu dailyMenu);
    Optional<DailyMenu> get(Long id);
    DailyMenu update(DailyMenu dailyMenu);
    void delete(DailyMenu dailyMenu);
}
