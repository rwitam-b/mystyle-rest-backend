package com.mystyle.controllers;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mystyle.entities.Product;
import com.mystyle.entities.ProductCategory;
import com.mystyle.services.ProductCategoryService;
import com.mystyle.services.ProductService;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private ProductCategoryService productCategoryService;

	// Get all products
	@RequestMapping(value = "/products/all", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		Collections.shuffle(products);
		return products;
	}

	// Get all products listed brand wise
	@RequestMapping(value = "/products/all/{n}", method = RequestMethod.GET)
	public List<Product> getFirstNProducts(@PathVariable Integer n) {
		List<Product> products = productService.getFirstNProducts(n);
		Collections.shuffle(products);
		return products;
	}

	// Get product by product id
	@RequestMapping(value = "/products/id/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable Integer id) {
		return productService.getProductById(id);
	}

	// Get products by product category
	@RequestMapping(value = "/products/category/{categoryId}", method = RequestMethod.GET)
	public List<Product> getProductsByCategory(@PathVariable Integer categoryId) {
		return productService.getProductsByCategory(categoryId);
	}

	// Get all available product brands
	@RequestMapping(value = "/products/brand/names", method = RequestMethod.GET)
	public List<String> getBrandNames() {
		return productService.getBrandNames();
	}

	// Get all products listed brand wise
	@RequestMapping(value = "/products/brand/all", method = RequestMethod.GET)
	public HashMap<String, Object> getProductsByBrand() {
		HashMap<String, Object> out = new HashMap<>();
		List<String> brands = productService.getBrandNames();
		brands.forEach(x -> out.put(x, productService.getProductsByBrandName(x)));
		return out;
	}

	// Get all products of a particular brand
	@RequestMapping(value = "/products/brand/{brandName}", method = RequestMethod.GET)
	public List<Product> getProductsByBrandName(@PathVariable String brandName) {
		return productService.getProductsByBrandName(brandName);
	}

	// Get all product categories
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<ProductCategory> getAllProductCategories() {
		return productCategoryService.getAllProductCategories();
	}

	// Get product category by id
	@RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
	public ProductCategory getProductCategoryById(@PathVariable Integer id) {
		return productCategoryService.getProductCategoryById(id);
	}

	// Add new product
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public void addProduct(@RequestBody Product p) {
		productService.addProduct(p);
	}

	// Add new product category
	@RequestMapping(value = "/categories", method = RequestMethod.POST)
	public void addProductCategory(@RequestBody ProductCategory p) {
		productCategoryService.addProductCategory(p);
	}
}