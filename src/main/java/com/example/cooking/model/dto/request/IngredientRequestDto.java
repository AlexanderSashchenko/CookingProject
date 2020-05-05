package com.example.cooking.model.dto.request;

import java.util.List;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
public class IngredientRequestDto {
    @NotNull
    @Size(min = 1, max = 99)
    private String name;
    @NotNull
    @Min(value = 1)
    private long mealCategoryId;
    @NotNull
    @Min(value = 1)
    private long primaryMeasureTypeId;
    @NotEmpty
    private List<Long> measureTypeIds;
    @Positive
    private int caloriesPerHundredGrams;
    @Positive
    private double proteinPerHundredGrams;
    @Positive
    private double fatPerHundredGrams;
    @Positive
    private double carbohydratePerHundredGrams;
}
