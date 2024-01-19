package com.ilp.service;

import java.util.List;

public class NewRecommendation extends FoodRecommendation { //for new users to avoid cold start problem
 @Override
 public List<String> recommendFood() {
	 System.out.println("This is a new method specific to NewRecommendation.");
     return List.of("New Food 1", "New Food 2", "New Food 3");
 }
}
