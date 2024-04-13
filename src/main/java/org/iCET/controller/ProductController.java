package org.iCET.controller;

import lombok.RequiredArgsConstructor;
import org.iCET.dto.Product;
import org.iCET.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    final ProductService service;
    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @DeleteMapping("/remove/{id}")
    public String deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return "Deleted product successfully!";
    }
}
