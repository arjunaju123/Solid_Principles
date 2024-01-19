package com.ilp.service;

import java.util.Date;

public 

interface BasicFoodBooking {
 void bookFood(String foodItem, int quantity, Date deliveryDate);
 
 //void bookSpecialFood(String specialFoodItem, int quantity, Date deliveryDate);
 //If i add bookSpecialFood function also here it violates ISP.
}
