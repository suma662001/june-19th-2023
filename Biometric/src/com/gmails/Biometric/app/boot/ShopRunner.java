package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.SalesMan;
import com.gmails.Biometric.app.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop shop =new Shop();
		System.out.println(shop.shopKeeper);
		System.out.println(shop.noOfitems);
        shop.calling();
		shop.goodFeedback();
        SalesMan salesMan =shop.salesMan;
        
		System.out.println("------------");
		System.out.println(salesMan.salesMan);
		System.out.println(salesMan.salary);
     
        
        
	}

}
