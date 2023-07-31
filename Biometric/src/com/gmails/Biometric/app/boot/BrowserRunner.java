package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Browser;
import com.gmails.Biometric.app.Internet;

public class BrowserRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser browser=new Browser();
		System.out.println(browser.browserName);
		System.out.println(browser.address);
        browser.retrive();
		browser.search();
		Internet internet= browser.internet;
		
		System.out.println("----------------");
	
		System.out.println(internet.internetName);
		System.out.println(internet.speed);
        internet.connect();
		internet.search();
		
	}

}
