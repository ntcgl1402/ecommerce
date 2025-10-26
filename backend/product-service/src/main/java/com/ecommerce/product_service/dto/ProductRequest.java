package com.ecommerce.product_service.dto;

import com.ecommerce.product_service.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String imageUrl;
    private Category category;
}