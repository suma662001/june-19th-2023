package com.gmails.Biometric.app;

public class PowerBank {
public int range=5000;
public String brandName="anker";
public Battery battery=new Battery();


public void controlPower()
{
	System.out.println("invoking main in controlpower in powerBank");
	
	if(this.battery!=null)
	 {
	this.battery.storage();
     }
	else 
	{
		System.out.println("battery is null");
		
	}
	}




public void charging()
{
	System.out.println("invoking main in charging in pwerbank");
	
}

	
}
