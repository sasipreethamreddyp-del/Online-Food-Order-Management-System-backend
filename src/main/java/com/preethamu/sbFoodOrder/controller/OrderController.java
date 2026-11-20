package com.preethamu.sbFoodOrder.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preethamu.sbFoodOrder.model.Order;
import com.preethamu.sbFoodOrder.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public Order placeOrder(@RequestBody Order order) {
		return orderService.placeOrder(order);
	}

	@GetMapping("/{userId}")
	public Optional<Order> getUserOrders(@PathVariable Long userId) {
		return orderService.getUserOrder(userId);
	}
}
