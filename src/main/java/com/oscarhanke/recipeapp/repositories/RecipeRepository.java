package com.oscarhanke.recipeapp.repositories;

import com.oscarhanke.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
