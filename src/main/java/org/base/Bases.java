package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bases {
	
	WebDriver driver;
	
	
	public static void browser() {
		
		WebDriverManager.chromedriver().setup();
		
	}

}
