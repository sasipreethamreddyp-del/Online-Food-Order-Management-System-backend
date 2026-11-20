package com.preethamu.sbFoodOrder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethamu.sbFoodOrder.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Long>{

}
