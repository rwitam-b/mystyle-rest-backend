package com.mystyle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mystyle.entities.ProductCategory;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

}
