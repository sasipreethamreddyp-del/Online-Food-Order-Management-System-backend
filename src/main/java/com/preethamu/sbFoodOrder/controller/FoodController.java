package com.preethamu.sbFoodOrder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preethamu.sbFoodOrder.model.FoodItem;
import com.preethamu.sbFoodOrder.service.FoodService;

@RestController
@RequestMapping("/foods")
public class FoodController {

	@Autowired
	private FoodService foodService;

	@GetMapping
	public List<FoodItem> getAllFoods() {
		return foodService.getAllFoods();
	}

	@PostMapping
	public FoodItem addFoodItem(@RequestBody FoodItem food) {
		return foodService.addItem(food);
	}

	@PutMapping("/{id}")
	public FoodItem updateFood(@PathVariable Long id, @RequestBody FoodItem food) {
		return foodService.update(id, food);
	}

	@DeleteMapping("/{id}")
	public String deleteFood(@PathVariable Long id) {
		foodService.deleteFood(id);
		return "Food Deleted";
	}

}
