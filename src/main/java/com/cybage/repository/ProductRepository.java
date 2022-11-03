package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
}
