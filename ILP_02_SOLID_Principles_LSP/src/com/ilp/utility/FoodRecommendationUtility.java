package com.ilp.utility;

import java.util.List;

import com.ilp.service.*;

public class FoodRecommendationUtility {

	public static void main(String[] args) {
        FoodRecommendation userRecommendation = new UserBasedFoodRecommendation();
        List<String> userFoodList = userRecommendation.recommendFood();
        System.out.println("User-based Recommendation: " + userFoodList);

        FoodRecommendation aiModelRecommendation = new AIModelBasedFoodRecommendation();
        List<String> aiModelFoodList = aiModelRecommendation.recommendFood();
        System.out.println("AI Model-based Recommendation: " + aiModelFoodList);

        FoodRecommendation newRecommendation = new NewRecommendation();
        List<String> newFoodList = newRecommendation.recommendFood();
        System.out.println("New Recommendation: " + newFoodList);

    }

}




