package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SildeDropDown {

	public static void main(String[] args) {
		//set properties
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//navigate to facebook
		driver.get("https://www.facebook.com/");
		
		//identify drop down element
		WebElement dropDown = driver.findElement(By.cssSelector("select#month"));
		Select obj = new Select(dropDown);
		
		//get all values from the drop down
		List<WebElement> values = obj.getOptions();
		
		int total = values.size();
		System.out.println(total);
		
		//quit driver
		driver.quit();
		
		
		
		
		
		
	}
}
