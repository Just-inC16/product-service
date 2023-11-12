package com.tcs.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}