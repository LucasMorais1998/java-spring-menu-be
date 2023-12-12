package com.youtube.springmenuappbe.controllers;

import com.youtube.springmenuappbe.dtos.FoodResponseDTO;
import com.youtube.springmenuappbe.entities.Food;
import com.youtube.springmenuappbe.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
}
