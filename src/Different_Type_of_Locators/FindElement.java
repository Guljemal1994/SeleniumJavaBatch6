package Different_Type_of_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		//driver.findElement(By.id("lst-ib")).sendKeys("absd");//we can write single line
		
		WebElement textBox = driver.findElement(By.id("lst-ib"));
		
		textBox.sendKeys("Automation Step by step");
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}
