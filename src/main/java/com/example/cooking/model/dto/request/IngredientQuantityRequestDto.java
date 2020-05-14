package com.example.cooking.model.dto.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class IngredientQuantityRequestDto {
    @NotNull
    @Min(value = 0)
    private int quantity;
}
