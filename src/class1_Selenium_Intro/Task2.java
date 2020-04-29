package class1_Selenium_Intro;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
public static void main(String[] args) {
	
	System.getProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redfin.com/");
	String str = driver.getCurrentUrl();
	String str1 = "https://www.redfin.com/";
	if(str.equalsIgnoreCase(str1)) {
		System.out.println("Navigated passed");
	}else {
		System.out.println("Navigated failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
