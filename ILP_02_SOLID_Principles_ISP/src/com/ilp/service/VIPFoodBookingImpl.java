package com.ilp.service;

import java.util.Date;

public 
class VIPFoodBookingImpl implements VIPFoodBooking {
    @Override
    public void bookSpecialFood(String specialFoodItem, int quantity, Date deliveryDate) {

        System.out.println("VIP user booked " + quantity + " " + specialFoodItem + "(s) for delivery on " + deliveryDate);
    }
}
