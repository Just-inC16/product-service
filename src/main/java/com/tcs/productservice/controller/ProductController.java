package com.tcs.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.productservice.entity.Product;
import com.tcs.productservice.entity.ProductDto;
import com.tcs.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.save(product);
	}

	@GetMapping("/{id}")
	public ProductDto getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
}