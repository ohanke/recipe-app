package com.oscarhanke.recipeapp.controllers;

import com.oscarhanke.recipeapp.Services.RecipeService;
import com.oscarhanke.recipeapp.domain.Category;
import com.oscarhanke.recipeapp.domain.UnitOfMeasure;
import com.oscarhanke.recipeapp.repositories.CategoryRepository;
import com.oscarhanke.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
