package class1_Selenium_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) {

		//making connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//opening the browser by calling the constructor of ChromeDriver class and upcasting
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);//https://www.google.com/

		
		System.out.println(driver.getTitle());//Google
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
