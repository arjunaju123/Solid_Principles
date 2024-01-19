package com.ilp.service;

import java.util.List;

public class UserBasedFoodRecommendation extends FoodRecommendation {
 @Override
public
 List<String> recommendFood() {
     return List.of("Pizza", "Burger", "Salad");
 }
}
