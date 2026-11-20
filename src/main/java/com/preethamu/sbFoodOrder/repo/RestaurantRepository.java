package com.preethamu.sbFoodOrder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethamu.sbFoodOrder.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
