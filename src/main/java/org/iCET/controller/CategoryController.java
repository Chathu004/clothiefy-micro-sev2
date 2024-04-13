package org.iCET.controller;

import lombok.RequiredArgsConstructor;
import org.iCET.dto.Category;
import org.iCET.entity.CategoryEntity;
import org.iCET.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    final CategoryService service;
    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        service.addCategory(category);
    }
    @GetMapping("/get")
    public Iterable<CategoryEntity> getCategory(){
        return service.getCategory();
    }
    @DeleteMapping("/remove{id}")
    public String deleteCategory(@PathVariable Long id){
        service.deleteCategory(id);
        return "Deleted  category successfully!";
    }


}
