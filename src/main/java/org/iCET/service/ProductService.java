package org.iCET.service;

import org.iCET.dto.Product;
import org.iCET.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    boolean deleteProduct(Long id);
    List<ProductEntity> getProduct();
}
