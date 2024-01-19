package com.ilp.utility;

import java.util.Date;

import com.ilp.service.*;

public class FoodBookingUtility {

    public static void main(String[] args) {
        BasicFoodBooking regularBooking = new RegularFoodBooking();
        regularBooking.bookFood("Pizza", 2, new Date());

        VIPFoodBooking vipBooking = new VIPFoodBookingImpl();
        vipBooking.bookSpecialFood("Exclusive Meal", 1, new Date());
    }
}
