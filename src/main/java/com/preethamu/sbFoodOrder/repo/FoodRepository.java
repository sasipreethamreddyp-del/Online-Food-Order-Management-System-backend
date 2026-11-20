package com.preethamu.sbFoodOrder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethamu.sbFoodOrder.model.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem,Long>{

}
