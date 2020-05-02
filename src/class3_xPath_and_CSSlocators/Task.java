package class3_xPath_and_CSSlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	/*
	 * Using xPath ONLY TC 2: Mercury Tours Registration: Open chrome browser Go to
	 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
	 * info (skip dropdowns) Click Submit User successfully registered
	 * 
	 */

	public static void main(String[] args) {
		// XPath
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[(text(), 'REGISTER)]")).click();
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Jem");
		driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Mert");
		driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("7874517");
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("Jemka.@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("Dogwood Dr");
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Dallas");
		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("something");

		driver.findElement(By.xpath("//select[@name = 'country']")).sendKeys("Mert");
		driver.findElement(By.xpath("//option[@value = '20']")).click();

		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Jemka.@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("gul7777");
		driver.findElement(By.xpath("//input[@name = 'confirmPassword']")).sendKeys("gul7777");
		driver.findElement(By.xpath("//input[@name = 'register'")).click();

	}

}
