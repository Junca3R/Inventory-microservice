package com.inventory.service;

import java.util.List;

import com.inventory.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    Product deleteProduct(Long id);
    
    
}
