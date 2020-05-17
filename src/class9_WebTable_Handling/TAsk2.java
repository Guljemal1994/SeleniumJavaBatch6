package class9_WebTable_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TAsk2 {

	public static void main(String[] args) {

		/*
		 * TC 2: Delete Employee Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
		 * the application Add Employee Verify Employee has been added Go to Employee
		 * List Delete added Employee Quit the browser
		 * 
		 */

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
