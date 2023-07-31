package com.gmails.Biometric.app;

public class Hospital {
	public String hospitalname ="C G Hostel";
	public String location = "davanagere";
	public Doctor doctor=new Doctor();


	public void healthcare ()
	{
		System.out.println("invoking main healthcare in hospital");
	
			
	}
		
	public void checkup()
	{
		System.out.println("invoking main in checkup in hospital ");
		
        this.doctor.operation();
	}

}
