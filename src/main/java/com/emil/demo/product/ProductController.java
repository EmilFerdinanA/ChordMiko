package com.emil.demo.product;

import com.emil.demo.product.dto.ProductRequest;
import com.emil.demo.product.dto.ProductResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAll() {
        List<Product> products = productService.getAll();

        List<ProductResponse> responses =  products.stream()
                .map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .build())
                .toList();

        return ResponseEntity.ok().body(responses);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> create(@Valid @RequestBody ProductRequest request) {
        Product product = productService.create(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(product);
    }
}
