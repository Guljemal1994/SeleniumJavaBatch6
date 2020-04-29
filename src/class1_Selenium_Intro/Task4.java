package class1_Selenium_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.instagram.com/");
		
		dr.findElement(By.className("email")).sendKeys("jem@gmail.com");
		
		dr.findElement(By.className("fullName")).sendKeys("Jemka");
		
		dr.findElement(By.className("username")).sendKeys("Mert");
		
		dr.findElement(By.id("password")).sendKeys("123123");
		
		dr.findElement(By.className("Sign up")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
