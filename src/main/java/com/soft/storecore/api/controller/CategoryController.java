package com.soft.storecore.api.controller;

import com.soft.storecore.facade.category.data.CategoryData;
import com.soft.storecore.facade.category.facade.CategoryFacade;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static com.soft.storecore.api.util.ApiConstants.FE_HTTP_URI;

@RestController
@RequestMapping("api/categories")
@CrossOrigin(origins = FE_HTTP_URI)
public class CategoryController {

    @Resource
    private CategoryFacade categoryFacade;

    @GetMapping
    public List<CategoryData> getCategories(){
        return categoryFacade.findAll();
    }
}
