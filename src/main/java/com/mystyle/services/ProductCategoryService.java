package com.mystyle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystyle.entities.ProductCategory;
import com.mystyle.repositories.ProductCategoryRepository;

@Service
public class ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	public List<ProductCategory> getAllProductCategories() {
		List<ProductCategory> productCategories = new ArrayList<>();
		productCategoryRepository.findAll().forEach(productCategories::add);
		return productCategories;
	}

	public void addProductCategory(ProductCategory p) {
		productCategoryRepository.save(p);
	}
	
	public ProductCategory getProductCategoryById(Integer id) {
		return productCategoryRepository.findById(id).orElse(null);
	}

}
