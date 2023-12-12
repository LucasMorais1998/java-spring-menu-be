package com.youtube.springmenuappbe.controllers;

import com.youtube.springmenuappbe.dtos.FoodRequestDTO;
import com.youtube.springmenuappbe.dtos.FoodResponseDTO;
import com.youtube.springmenuappbe.entities.Food;
import com.youtube.springmenuappbe.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Food saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);

        return repository.save(foodData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAllFoods() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();

        return foodList;
    }
}
