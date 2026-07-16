package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product, Long> {
    
}
