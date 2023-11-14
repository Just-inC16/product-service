package com.tcs.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.productservice.entity.Product;
import com.tcs.productservice.entity.ProductDto;
import com.tcs.productservice.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public ProductDto getProductById(Long id) {
		Product currentProduct = productRepository.getReferenceById(id);
		System.out.println(currentProduct.toString());
		ProductDto currentProductDto = new ProductDto(currentProduct.getId(), currentProduct.getName(),
				currentProduct.getPrice());
		return currentProductDto;
	}
}
