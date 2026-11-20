package com.preethamu.sbFoodOrder.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.preethamu.sbFoodOrder.model.Cart;
import com.preethamu.sbFoodOrder.repo.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	@PostMapping
	public Cart addToCart(Cart cart) {
		return cartRepository.save(cart);
	}
	
//	@GetMapping
//	public Optional<Cart> getUserCart(Long userId){
//		return cartRepository.findById(userId);
//		
//	}
	@GetMapping
	public Optional<Cart> getUserCart(Long userid){
        return cartRepository.findById(userid);
    }
	
	@DeleteMapping
	public void removeCartItem(Long id) {
		cartRepository.deleteById(id);
	}

}
