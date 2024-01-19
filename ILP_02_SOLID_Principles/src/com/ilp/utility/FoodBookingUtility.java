package com.ilp.utility;

import java.util.Date;

import com.ilp.service.*;

public class FoodBookingUtility {

    public static void main(String[] args) {
        // Client code
        FoodBooking regularBooking = new VegFoodBooking();
        regularBooking.bookFood("Burger", 2, new Date());

        FoodBooking vipBooking = new NonVegFoodBooking();
        vipBooking.bookFood("Special Meal", 1, new Date());
    }

}
