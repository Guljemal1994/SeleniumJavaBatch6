package Different_Type_of_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver drivers = new ChromeDriver();
		drivers.get("http://instagram.com");
		drivers.findElement(By.name("username")).sendKeys("jemkajik");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
