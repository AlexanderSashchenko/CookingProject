package com.example.cooking.model.dto.request;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class RecipeRequestDto {

    private String name;
    private String description;
    //TODO: File photo
    private List<Long> dishTypeIds;
    private List<Long> mealTimeIds;
    private Map<Long, Integer> ingredients;
    private List<Long> portionIds;
    private int preparationTime;
}
