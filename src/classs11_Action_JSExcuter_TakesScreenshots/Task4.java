package classs11_Action_JSExcuter_TakesScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Task4 extends CommonMethods{

	/*
	 * TC 4: HRMS Login Navigate to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login to the
	 * application by writing xpath based on “following and preceding siblings”
	 * click login button using JS executer.
	 * 
	 */
	public static void main(String[] args) {

		setUp();

		driver.findElement(By.xpath("//div[@id='divUsername']//input")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.xpath("//div[@id='divPassword']//following::input")).sendKeys(ConfigsReader.getProperty("password"));

		WebElement login = driver.findElement(By.xpath("//div[@id='divPassword']/following::input"));

		JavascriptExecutor jSe = (JavascriptExecutor) driver;
		jSe.executeScript("arguments[0]", login);
		
		
		
		
		
		
		
		
		
		
		
		tearDown();

	}

}
