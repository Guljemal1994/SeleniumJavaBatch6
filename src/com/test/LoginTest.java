package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommanMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommanMethods{

	public static void main(String[] args) {
		
		/*
		 * Usercshould be able to login to the application with valid cerdentials
		 * 
		 */
		setUp();
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName,ConfigsReader.getProperty("txtUsername"));
		
		//sending password 
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password,ConfigsReader.getProperty("txtPassword"));
		
		
		
		//close browser
		tearDown();
		
		
		
		
		
		
		
		
		
		
	}

}
