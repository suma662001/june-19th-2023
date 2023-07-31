package com.gmails.Biometric.app;

public class Shop {

	
	public String shopKeeper ="pasad";
	public int noOfitems = 100;
	public SalesMan salesMan=new SalesMan();


	public void calling ()
	{
		System.out.println("invoking main calling in salesMan");
		if(this.salesMan!=null) {
		this.salesMan.productsales();
	}
	else
	{
		System.out.println("it is null");
		
			
	}
		}
	public void goodFeedback()
	{
		System.out.println("invoking main in goodFeedback in salesMan");
        this.salesMan.purchase();
	}
	
	
}
