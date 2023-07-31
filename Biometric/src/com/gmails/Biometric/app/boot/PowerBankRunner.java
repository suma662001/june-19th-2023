package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Battery;
import com.gmails.Biometric.app.PowerBank;

public class PowerBankRunner {

	public static void main(String[] args) {
	
		
		PowerBank powerBank=new PowerBank();
	    System.out.println(powerBank.range);
	    System.out.println(powerBank.brandName);
	    powerBank.controlPower();
	    powerBank.charging();

     	Battery battery =powerBank.battery;
    	
      System.out.println("=======");
      System.out.println(battery.storage);
	  System.out.println(battery.type);
       
		
	

	}

}
