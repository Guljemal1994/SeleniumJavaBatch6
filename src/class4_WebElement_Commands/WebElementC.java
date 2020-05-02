package class4_WebElement_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		userName.sendKeys("Tester");
		Thread.sleep(3000);
		userName.clear();
		
		WebElement password = driver.findElement(By.cssSelector("input[name*='$password']"));
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("test");
		Thread.sleep(3000);
		
		
		WebElement login = driver.findElement(By.cssSelector("input[value='Login']"));
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
