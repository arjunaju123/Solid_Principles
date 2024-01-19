package com.ilp.service;

import java.util.Date;

public class VegFoodBooking implements FoodBooking {
 @Override
 public void bookFood(String foodItem, int quantity, Date deliveryDate) {
     System.out.println("Regular Food Booking: " +
             "Item: " + foodItem +
             ", Quantity: " + quantity +
             ", Delivery Date: " + deliveryDate);
 }
 
// public void VegBookFood(String foodItem, int quantity, Date deliveryDate) {
//     System.out.println("Regular Food Booking: " +
//             "Item: " + foodItem +
//             ", Quantity: " + quantity +
//             ", Delivery Date: " + deliveryDate);
// }
// 
// public void NonVegBookFood(String foodItem, int quantity, Date deliveryDate) {
//     System.out.println("Regular Food Booking: " +
//             "Item: " + foodItem +
//             ", Quantity: " + quantity +
//             ", Delivery Date: " + deliveryDate);
// }
 
 //violates Open Close principle
}