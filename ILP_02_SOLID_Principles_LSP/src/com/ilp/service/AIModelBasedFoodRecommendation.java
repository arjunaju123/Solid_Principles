package com.ilp.service;

import java.util.List;

public class AIModelBasedFoodRecommendation extends UserBasedFoodRecommendation {
 //using function of the  UserBasedFoodRecommendation
}

//public class AIModelBasedFoodRecommendation extends FoodRecommendation {
//	 @Override
//	 public List<String> recommendFood() {
//	 
//	     return List.of("Sushi", "Pasta", "Smoothie");
//	 }
//}

//This will violate the LSP because I dont need the FoodRecommendation parent class functionality for
//child class AIModelBasedFoodRecommendation.I need a specific function of UserBasedFoodRecommendation