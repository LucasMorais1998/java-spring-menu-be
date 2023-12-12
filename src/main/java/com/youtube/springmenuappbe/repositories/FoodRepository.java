package com.youtube.springmenuappbe.repositories;

import com.youtube.springmenuappbe.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepository extends JpaRepository<Food, UUID> {
}
