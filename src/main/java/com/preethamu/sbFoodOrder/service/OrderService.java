package com.preethamu.sbFoodOrder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.preethamu.sbFoodOrder.model.Order;
import com.preethamu.sbFoodOrder.repo.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping
	public Order placeOrder(Order order) {
		return orderRepository.save(order);

	}

	@GetMapping
	public Optional<Order> getUserOrder(Long userid) {
		return orderRepository.findById(userid);
	}
}
