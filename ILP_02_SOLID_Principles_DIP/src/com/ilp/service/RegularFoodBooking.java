package com.ilp.service;

import java.util.Date;

public 
class RegularFoodBooking implements FoodBooking {
    @Override
    public void bookFood(String foodItem, int quantity, Date deliveryDate) {
        
        System.out.println("Regular user booked " + quantity + " " + foodItem + "(s) for delivery on " + deliveryDate);
    }
}
