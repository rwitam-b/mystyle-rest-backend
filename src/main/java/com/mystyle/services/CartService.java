package com.mystyle.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystyle.entities.Product;
import com.mystyle.repositories.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
//	public List<Cart> getAllProducts() {
//		List<Product> products = new ArrayList<>();
//		productRepository.findAll().forEach(products::add);
//		return products;
//	}
}
