package org.iCET.service.impl;

import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.iCET.dto.Product;
import org.iCET.entity.CategoryEntity;
import org.iCET.entity.ProductEntity;
import org.iCET.repository.ProductRepository;
import org.iCET.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    final ProductRepository repository;
    final ModelMapper mapper;
    @Override
    public void addProduct(Product product) {
//        ProductEntity entity = mapper.map(product,ProductEntity.class);
//
//        // Set the CategoryEntity based on the categoryId
//        if (product.getId() != null) {
//            CategoryEntity categoryEntity = new CategoryEntity();
//            categoryEntity.setId(product.getId());
//            entity.setCategoryEntity(categoryEntity);
//        }
//
//        repository.save(entity);
    }

    @Override
    public boolean deleteProduct(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<ProductEntity> getProduct() {
        return (List<ProductEntity>) repository.findAll();
    }
}
