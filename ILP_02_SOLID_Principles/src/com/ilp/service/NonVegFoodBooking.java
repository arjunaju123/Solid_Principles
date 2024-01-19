package com.ilp.service;

import java.util.Date;

public class NonVegFoodBooking implements FoodBooking {
 @Override
 public void bookFood(String foodItem, int quantity, Date deliveryDate) {
    
     System.out.println("Non veg Food Booking: " +
             "Item: " + foodItem +
             ", Quantity: " + quantity +
             ", Delivery Date: " + deliveryDate);
 }
}
