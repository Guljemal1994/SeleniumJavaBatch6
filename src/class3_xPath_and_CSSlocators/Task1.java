package class3_xPath_and_CSSlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*
	 * Using Css ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
	 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
	 * info (skip dropdowns) Click Submit User successfully registered
	 * 
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.cssSelector("input[name* = 'firstName']")).sendKeys("Jemal");
		driver.findElement(By.cssSelector("input[name* = 'lastName']")).sendKeys("Mert");
		driver.findElement(By.cssSelector("input[name* = 'phone']")).sendKeys("7896544");
		driver.findElement(By.cssSelector("input[name* = 'userName']")).sendKeys("Jemal@gmail.com");
		driver.findElement(By.cssSelector("input[name* = 'adsress1']")).sendKeys("Dogwood DR");
		driver.findElement(By.cssSelector("input[name* = 'postalCode']")).sendKeys("4587458");
		driver.findElement(By.cssSelector("//input[@name = 'city']")).sendKeys("Dallas");
		driver.findElement(By.cssSelector("//input[@name = 'state']")).sendKeys("Texas");
		driver.findElement(By.cssSelector("input[id* = 'email']")).sendKeys("Jemal");
		driver.findElement(By.cssSelector("input[name* = 'password']")).sendKeys("Jemal7777");
		driver.findElement(By.cssSelector("input[name* = 'confirmPas']")).sendKeys("Jemal7777");
		driver.findElement(By.cssSelector("input[name* = 'register']")).click();
		
		
		
		
	}

}
