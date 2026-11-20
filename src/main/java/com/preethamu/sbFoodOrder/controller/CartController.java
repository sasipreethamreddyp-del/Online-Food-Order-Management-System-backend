package com.preethamu.sbFoodOrder.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preethamu.sbFoodOrder.model.Cart;
import com.preethamu.sbFoodOrder.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping
	public Cart addToCart(@RequestBody Cart cart) {
		return cartService.addToCart(cart);
	}

	@GetMapping("/{userId}")
	public Optional<Cart> getUserCart(@PathVariable Long userId) {
		return cartService.getUserCart(userId);
	}

	@DeleteMapping("/{id}")
	public String removeCartItem(@PathVariable Long id) {
		cartService.removeCartItem(id);
		return "Item Removed From Cart";
	}
}
