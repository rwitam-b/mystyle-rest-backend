package com.mystyle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystyle.entities.Product;
import com.mystyle.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public List<Product> getFirstNProducts(Integer n) {
		return productRepository.getFirstNProducts(n);
	}

	public void addProduct(Product p) {
		productRepository.save(p);
	}

	public Product getProductById(Integer id) {
		return productRepository.findById(id).orElse(null);
	}

	public List<Product> getProductsByCategory(Integer categoryId) {
		return productRepository.findByCategoryId(categoryId);
	}

	public List<Product> getProductsByBrandName(String brandName) {
		return productRepository.findByBrandName(brandName);
	}

	public List<String> getBrandNames() {
		return productRepository.getBrandNames();
	}

}
