package com.emil.demo.product;

import com.emil.demo.product.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product create(ProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .build();

        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product update(String id, Product product) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
