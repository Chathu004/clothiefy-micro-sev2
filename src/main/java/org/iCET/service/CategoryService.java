package org.iCET.service;

import org.iCET.dto.Category;
import org.iCET.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    List<CategoryEntity> getCategory();
    boolean deleteCategory(Long id);
}
