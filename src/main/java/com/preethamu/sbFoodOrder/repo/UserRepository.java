package com.preethamu.sbFoodOrder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preethamu.sbFoodOrder.model.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
