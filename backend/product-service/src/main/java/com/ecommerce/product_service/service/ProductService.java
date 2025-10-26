package com.ecommerce.product_service.service;

import com.ecommerce.product_service.dto.ProductRequest;
import com.ecommerce.product_service.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest request);
    ProductResponse updateProduct(String id, ProductRequest request);
    void deleteProduct(String id);
    ProductResponse getProductById(String id);
    List<ProductResponse> getAllProducts();
}
