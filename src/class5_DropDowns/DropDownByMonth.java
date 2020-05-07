package class5_DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownByMonth {

	public static void main(String[] args) {

		// set properties
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// navigate to facebook
		driver.get("https://www.facebook.com/");

		// identify drop down element
		WebElement dropDown = driver.findElement(By.cssSelector("select#month"));
		Select obj = new Select(dropDown);

		obj.selectByIndex(1);// will select Janurary

		obj.selectByValue("3");// will select March

		obj.selectByVisibleText("Aug");// will select August

		WebElement drop=driver.findElement(By.cssSelector("select#Day"));
		Select obj1 = new Select(drop);
		obj1.deselectByIndex(8);
		
		
		
		
		
		
		
		
		
		
		
	}
}
