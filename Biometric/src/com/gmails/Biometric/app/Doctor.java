package com.gmails.Biometric.app;

public class Doctor {
	public String doctorname ="nagaraj C G";
	public int  salary = 1000000;
	public Nurse  nurse=new Nurse();


	public void treatment ()
	{
		System.out.println("invoking main treatment in doctor");
		this.nurse.treatment();
			
	}
		
	public void operation()
	{
		System.out.println("invoking main in operation in doctor");
     
	}

}
	
	
	
	
	
	

