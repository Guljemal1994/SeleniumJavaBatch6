package class1_Selenium_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//go head and open chrome browser
		
		//Thread.sleep(2000); it wiil open the browser 2sec and then it will close
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
