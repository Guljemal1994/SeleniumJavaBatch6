package class3_xPath_and_CSSlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsssSelectorDemo {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/pim/addEmployee";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.cssSelector("input[id = 'txtUsername']")).sendKeys("Admin");//userName

		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");//password

		driver.findElement(By.cssSelector("input[id^=\"btn\"]")).click();//login button
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class$='Trigger']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
