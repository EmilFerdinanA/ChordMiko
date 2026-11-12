package com.emil.demo.product;

import com.emil.demo.product.dto.ProductRequest;

import java.util.List;

public interface ProductService {
    Product create(ProductRequest product);

    Product getProductById(String id);

    List<Product> getAll();

    Product update(String id, Product product);

    void delete(String id);
}
