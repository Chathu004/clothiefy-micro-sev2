package org.iCET.service.impl;

import lombok.RequiredArgsConstructor;
import org.iCET.dto.Category;
import org.iCET.entity.CategoryEntity;
import org.iCET.repository.CategoryRepository;
import org.iCET.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
     final CategoryRepository repository;
     final ModelMapper mapper;

    @Override
    public CategoryEntity addCategory(Category category) {
        CategoryEntity entity = new CategoryEntity();
        entity.setName(category.getName());
        return repository.save(entity);
    }

    @Override
    public List<CategoryEntity> getCategory() {
        return (List<CategoryEntity>) repository.findAll();
    }

    @Override
    public Category getCategoryByName(String name) {
        return mapper.map(repository.getByName(name),Category.class);
    }

    @Override
    public boolean deleteCategory(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
