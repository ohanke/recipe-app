package com.oscarhanke.recipeapp.repositories;

import com.oscarhanke.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
