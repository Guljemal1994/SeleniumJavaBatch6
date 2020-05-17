package classs11_Action_JSExcuter_TakesScreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task3 extends CommonMethods{

	/*
	 * TC 3: HRMS Login Navigate to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login to the
	 * application by writing xpath based on “parent and child relation”
	 * 
	 */
	public static void main(String[] args) {

		setUp();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName,"Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password,"Hum@nhrm123");
		
		WebElement  loginButton= driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		loginButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
		
	}


