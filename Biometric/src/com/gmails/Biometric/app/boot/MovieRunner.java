package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Auditor;
import com.gmails.Biometric.app.Company;
import com.gmails.Biometric.app.Movie;
import com.gmails.Biometric.app.Producer;

public class MovieRunner {

	public static void main(String[] values)
	{
  
		System.out.println("running  main in movie");
		Movie movie= new Movie();
		String name=movie.name;
		System.out.println(name);
		
		String lang=movie.lang;
		System.out.println(lang);
		Producer producer=movie.producer;
		
		int budget=producer.budget;
		System.out.println(budget);
		
		long mobileNo=producer.mobileNo;
		System.out.println(mobileNo);
	    Auditor auditor=producer.auditor;
		 
		long adharNo=auditor.adharNo;
		System.out.println(adharNo);
		Company company=auditor.company;
		
		String location=company.location;
		System.out.println(location);
		
		String companyname =company.companyname;
		System.out.println(companyname);
		
		
		

	}
}
