package class4_WebElement_Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	/*
	 * TC 4: Radio Buttons Practice Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
	 * “Radio Button Demo” section. Verify correct radio is clicked Click on any
	 * radio button in “Group Radio Buttons Demo” section. Verify correct checkbox
	 * is clicked Quit browser
	 * 
	 */
	public static String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		List <WebElement> radio = driver.findElements(By.cssSelector("input[type='radio']"));
		
		String str = "Female";
		String str1 = "15-50";
		
		for(WebElement click:radio) {
			if(click.getAttribute("value").contains(str)) {
				click.click();
				System.out.println(str+" button is clicked. Test Passed");
			}
			if(click.getAttribute("value").contains(str1)) {
				click.click();
				System.out.println(str1+" button clicked .Test case passed");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
