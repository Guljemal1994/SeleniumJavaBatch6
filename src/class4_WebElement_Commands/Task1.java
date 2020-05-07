package class4_WebElement_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

		public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: HRMS Application Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username and password Click on login button Then verify Syntax Logo is
		 * displayed.
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id=txtUsername]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[name=Submit]")).click();
		
		WebElement el = driver.findElement(By.xpath("//img[contains(@src, 'human')]"));
		boolean logoDis = el.isDisplayed();
		Thread.sleep(4000);
		if(logoDis) {
			System.out.println("Displayed, case passed ");
		}else {
			System.out.println("Logo is not displayed, Test case faild");
		}
		
		//driver.close();
		
		
		
		
		
		
		
	}

	
}
