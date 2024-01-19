package com.ilp.utility;

import java.util.Date;

import com.ilp.service.*;

public class FoodBookingUtility {

    public static void main(String[] args) {
      
        FoodBooking regularBooking = new RegularFoodBooking();
        regularBooking.bookFood("Pizza", 2, new Date());
        
        FoodBooking vipBooking = new VIPFoodBookingImpl();
        vipBooking.bookFood("Exclusive Meal", 1, new Date());
        
//        RegularFoodBooking regularFoodBooking = new RegularFoodBooking();
//        regularFoodBooking.bookFood("Pizza", 2, new Date());
        // this code violates the DIP
    }
}
