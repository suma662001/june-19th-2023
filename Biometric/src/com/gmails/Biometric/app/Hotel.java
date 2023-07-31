package com.gmails.Biometric.app;

public class Hotel {

	public String name ="taj";
	public String  ratings =" 5 star";
	public Cook cook=new Cook();
	
	public void foodService()
	{
		System.out.println("invoking main in foodservice in hotel");
		if(this.cook!=null) 
		{
		this.cook.cooking();
		}
		else
		{
			System.out.println("cooking is null");
		}
	}
	
	public void eating() 
	{
	  System.out.println("invoking main in eating  in hotel");
      this.cook.cookStyle();
	}
	
	
	
}
