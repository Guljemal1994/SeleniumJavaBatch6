package class4_WebElement_Commands;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Inputs {

	/*
	 * TC 3: Syntax Demo input boxes count: Open chrome browser Go to
	 * �http://jiravm.centralus.cloudapp.azure.com:8081/index.html� Click on �Input
	 * Forms� links Click on �Simple Form Demo� links Get all input boxes from the
	 * page Enter �Hello� to each text box Close browser
	 * 
	 */
	public static  String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		
		List <WebElement> allBox = driver.findElements(By.cssSelector("input[type='text']"));
		
		int size = allBox.size();
		System.out.println(size);
		
		for(WebElement text:allBox) {
		         text.sendKeys("Hello");
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
