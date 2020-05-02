package Different_Type_of_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportanceOflocator {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");//URL in the browser
		driver.findElement(By.id("email")).sendKeys("This is my fist code");
		
		
		
		
	}
}
