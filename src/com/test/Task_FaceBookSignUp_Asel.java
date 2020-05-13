package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommanMethods;

public class Task_FaceBookSignUp_Asel extends CommanMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select obj = new Select(monthDD);
		obj.selectByVisibleText("Sep");	
		
		Thread.sleep(3000);
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
}
