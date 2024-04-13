package org.iCET.service.impl;

import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.iCET.dto.Product;
import org.iCET.entity.ProductEntity;
import org.iCET.repository.ProductRepository;
import org.iCET.service.ProductService;
import org.modelmapper.ModelMapper;

import java.util.List;
@Server
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    final ProductRepository repository;
    final ModelMapper mapper;
    @Override
    public void addProduct(Product product) {
        ProductEntity entity = mapper.map(product,ProductEntity.class);
        repository.save(entity);
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
        return null;
    }
}
