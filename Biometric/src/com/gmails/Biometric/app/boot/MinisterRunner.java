package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Constituency;
import com.gmails.Biometric.app.IndiraCanteen;
import com.gmails.Biometric.app.Minister;
import com.gmails.Biometric.app.Producer;

public class MinisterRunner {

	public static void main(String[] args) {

		
		System.out.println("running  main in minister");
		Minister minister= new Minister();
		String ministerName=minister.ministerName;
		System.out.println(ministerName);
		
		int experience=minister.experience;
		System.out.println(experience);
	    Constituency constituency=minister.constituency;
	    
		System.out.println("running  main in constituency ");
		int no=constituency.no;
		System.out.println(no);
		
		int people=constituency.people;
		System.out.println(people);
	    IndiraCanteen indiraCanteen = constituency.indiraCanteen;

		System.out.println("running  main in indiraCanteen ");

		int breakFastPrice=indiraCanteen.breakFastPrice;
		System.out.println(breakFastPrice);
		
		int lunchPrice=indiraCanteen.lunchPrice;
		System.out.println(lunchPrice);
		
		
		
		
	}

}
