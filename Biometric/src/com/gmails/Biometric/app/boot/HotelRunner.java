package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Cook;
import com.gmails.Biometric.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Hotel hotel=new Hotel();	
	System.out.println(hotel.name);	
	System.out.println(hotel.ratings);
	hotel.foodService();
	hotel.eating();
	Cook cook=hotel.cook;
	
	System.out.println("------------------------");
	
	System.out.println(cook.cookname);	
	System.out.println(cook.item);
	
	
	
	}

}
