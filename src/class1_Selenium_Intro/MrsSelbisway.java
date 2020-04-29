package class1_Selenium_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MrsSelbisway {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.redfin.com/");
        
        System.out.println(driver.getCurrentUrl());
        
//        driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
