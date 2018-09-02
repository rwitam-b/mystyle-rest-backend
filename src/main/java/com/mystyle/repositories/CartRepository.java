package com.mystyle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mystyle.entities.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
