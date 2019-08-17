package com.soft.storecore.facade.populator;

import com.soft.storecore.facade.data.CategoryData;
import com.soft.storecore.model.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryPopulator implements Populator<Category, CategoryData> {

    @Override
    public void populate(Category category, CategoryData categoryData) {
        categoryData.setId(category.getId());
        categoryData.setName(category.getName());
        categoryData.setSuperCategory(category.getSuperCategory());
        categoryData.setChildCategories(category.getChildCategories());
    }
}