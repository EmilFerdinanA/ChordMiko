package com.emil.demo.product.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    @NotNull(message = "Name is required")
    private String name;

    @NotNull
    @DecimalMin(value = "0.0")
    private BigDecimal price;
}
