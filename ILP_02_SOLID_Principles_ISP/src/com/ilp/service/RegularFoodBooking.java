package com.ilp.service;

import java.util.Date;

public 
class RegularFoodBooking implements BasicFoodBooking {
    @Override
    public void bookFood(String foodItem, int quantity, Date deliveryDate) {
        System.out.println("Regular user booked " + quantity + " " + foodItem + "(s) for delivery on " + deliveryDate);
    }
}
