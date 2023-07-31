package com.gmails.Biometric.app;

public class Browser {
    public String browserName ="goole crome";
	public String address="web";
	public Internet internet=new Internet();
	
	
	
	public void retrive() 
	{
		System.out.println("invoking main in retrive in browser");
		this.internet.connect();
	}
	public void search() 
	{
		System.out.println("invoking main in search in browser");
		this.internet.search();
	}
	
}
