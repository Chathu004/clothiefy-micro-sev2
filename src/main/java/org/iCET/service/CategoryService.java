package org.iCET.service;

import org.iCET.dto.Category;
import org.iCET.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    CategoryEntity addCategory(Category category);
    List<CategoryEntity> getCategory();
    Category getCategoryByName(String name);
    boolean deleteCategory(Long id);
}
