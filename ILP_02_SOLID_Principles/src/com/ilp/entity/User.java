package com.ilp.entity;

public class User {
    private String userId;
    private String username;
    // Other user-related properties

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    // Getters and setters
}

//This example follows SOLID principles:
//
//Single Responsibility Principle: Each class has a single responsibility.
//Open/Closed Principle: You can extend the recommendation system without modifying existing code.
//Liskov Substitution Principle: Subtypes (e.g., specific recommendation services) can be substituted for their base types.
//Interface Segregation Principle: The RecommendationService interface is focused and does not force implementations to provide unnecessary methods.
//Dependency Inversion Principle: The FoodBookingController depends on abstractions (RecommendationService) rather than concrete implementations.
//
