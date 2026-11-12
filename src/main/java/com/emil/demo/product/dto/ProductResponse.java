package com.emil.demo.product.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductResponse {
    private String id;
    private String name;
    private BigDecimal price;
}
