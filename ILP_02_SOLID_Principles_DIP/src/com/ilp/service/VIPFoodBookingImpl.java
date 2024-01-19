package com.ilp.service;

import java.util.Date;

public 
class VIPFoodBookingImpl implements FoodBooking {
    @Override
    public void bookFood(String foodItem, int quantity, Date deliveryDate) {
       
        System.out.println("VIP user booked " + quantity + " " + foodItem + "(s) for delivery on " + deliveryDate);
    }
}
