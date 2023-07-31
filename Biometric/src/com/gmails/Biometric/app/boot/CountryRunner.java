package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Country;
import com.gmails.Biometric.app.HomeMinister;
import com.gmails.Biometric.app.PersonalAssistance;
import com.gmails.Biometric.app.President;
import com.gmails.Biometric.app.PrimeMinister;
import com.gmails.Biometric.app.SecurityHead;

public class CountryRunner {

	public static void main(String[] args) {


		System.out.println("running  main in Country");
		Country country= new Country();
		String countryName=country.countryName;
		System.out.println(countryName);
		
		int code=country.code;
		System.out.println(code);
		President president=country.president;


		System.out.println("running  main in president");
		String state=president.state;
		System.out.println(state);
		
		String power=president.power;
		System.out.println(power);
		PrimeMinister primeMinister=president.primeMinister;
		
		System.out.println("running  main in primeMinister");

		String primeMinisterName=primeMinister.primeMinisterName;
		System.out.println(primeMinisterName);	
		
		int primeAge=primeMinister.primeAge;
		System.out.println(primeAge);
		SecurityHead securityHead=primeMinister.securityHead;
		
		System.out.println("running  main in securityHead");
		int age=securityHead.age;
		System.out.println(age);
		
		String from=securityHead.from;
		System.out.println(from);
		PersonalAssistance personalAssistance=securityHead.personalAssistance;
		
		System.out.println("running  main in personalAssistance ");
		int salary= personalAssistance.salary;
		System.out.println(salary);
		
		int workdays= personalAssistance.workdays;
		System.out.println(workdays);	
		HomeMinister homeMinister=personalAssistance.homeMinister; 

        System.out.println("running  main in Homeminister");
        
        String homeministerName=homeMinister.homeministerName;
		System.out.println(homeministerName);
		
		int helpLine=homeMinister. helpLine;
		System.out.println(helpLine);
		
		
		
		
	}

}
