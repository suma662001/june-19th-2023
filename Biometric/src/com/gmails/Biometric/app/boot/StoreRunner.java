package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Strore;

public class StoreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] emails = {"suma662@.com","anitatelagi@.com","gdjdugj@y.com","rakshitha32@gmail.com"};
		
		Strore store=new Strore();
		store.email(emails);
		
		String[] grocerys = {"oil","sugar","salt","dhal"};

		
		Strore store1 = new Strore();
		store.groceryItems(grocerys);
		
		String[] iplTeams = {"mumbi","panjab","m s dhonichainni","kolkatha"};

		Strore store2 = new Strore();
		store.iplTeams(iplTeams);
		
		
		
		
		
	}

}
