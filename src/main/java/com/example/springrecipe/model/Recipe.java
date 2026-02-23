package com.example.springrecipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private Long id;
    private String name;
    private String description;
    private String instructions;
    private int cookingTime;
    private String difficulty;
}
