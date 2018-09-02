package com.mystyle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mystyle.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	public List<Product> findByCategoryId(Integer categoryId);

	public List<Product> findByBrandName(String brandName);

	@Query(value = "SELECT DISTINCT brandName FROM Product")
	public List<String> getBrandNames();

	@Query(value = "SELECT * FROM products ORDER BY RAND() LIMIT ?1", nativeQuery = true)
	public List<Product> getFirstNProducts(Integer n);
}