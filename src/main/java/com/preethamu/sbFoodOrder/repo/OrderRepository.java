package com.preethamu.sbFoodOrder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethamu.sbFoodOrder.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
