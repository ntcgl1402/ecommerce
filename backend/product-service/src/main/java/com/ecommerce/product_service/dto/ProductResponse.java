package com.ecommerce.product_service.dto;


import com.ecommerce.product_service.model.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String imageUrl;
    private Category category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
