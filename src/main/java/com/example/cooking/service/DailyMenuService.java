package com.example.cooking.service;

import com.example.cooking.model.DailyMenu;
import org.springframework.stereotype.Service;

@Service
public interface DailyMenuService {

    DailyMenu add(DailyMenu dailyMenu);

    DailyMenu get(Long id);

    DailyMenu update(DailyMenu dailyMenu);

    void delete(DailyMenu dailyMenu);
}
