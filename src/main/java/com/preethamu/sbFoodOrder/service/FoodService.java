package com.preethamu.sbFoodOrder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.preethamu.sbFoodOrder.model.FoodItem;
import com.preethamu.sbFoodOrder.repo.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;

	@GetMapping
	public List<FoodItem> getAllFoods() {
		return foodRepository.findAll();
	}

	@PostMapping
	public FoodItem addItem(FoodItem food) {
		return foodRepository.save(food);
	}

	@PutMapping
	public FoodItem update(Long id, FoodItem food) {
		FoodItem existingFood = foodRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Food item not found"));
		return foodRepository.save(existingFood);
	}

	@DeleteMapping
	public void deleteFood(Long id) {
		foodRepository.deleteById(id);
	}

}
