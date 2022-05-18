package com.oscarhanke.recipeapp.Services;

import com.oscarhanke.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService{
    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
