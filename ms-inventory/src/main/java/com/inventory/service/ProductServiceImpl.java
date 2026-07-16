package com.inventory.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventory.model.Product;
import com.inventory.repository.Productrepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@Data
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final Productrepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
      public Product getProductById(Long id){
        return productRepository.findById(id)
         .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
     }

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    
    @Override
    public Product updateProduct(Long id, Product product){
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
        
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStock(product.getStock());
        
        return productRepository.save(existingProduct);
    }

    @Override
    public Product deleteProduct(Long id){
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
        
        productRepository.delete(existingProduct);
        return existingProduct;}
    
}

